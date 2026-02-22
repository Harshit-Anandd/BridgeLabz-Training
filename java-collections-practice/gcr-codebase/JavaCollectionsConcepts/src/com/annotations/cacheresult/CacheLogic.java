package com.annotations.cacheresult;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheLogic {
    private Map<String, Object> cacheMap = new HashMap<>();
    private CalculatorService service = new CalculatorService();

    public void processCalculation(int number) {
        try {
            Method method = service.getClass().getMethod("computeSquare", int.class);
            String cacheKey = method.getName() + "_" + number;

            if (method.isAnnotationPresent(CacheResult.class)) {
                if (cacheMap.containsKey(cacheKey)) {
                    System.out.println("[Cache Hit] Result: " + cacheMap.get(cacheKey));
                    return;
                }
            }

            Object result = method.invoke(service, number);
            System.out.println("[Calculated] Result: " + result);

            if (method.isAnnotationPresent(CacheResult.class)) {
                cacheMap.put(cacheKey, result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

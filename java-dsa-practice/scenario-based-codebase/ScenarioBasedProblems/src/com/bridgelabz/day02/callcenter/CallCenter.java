package com.bridgelabz.day02.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {
    private Queue<Call> normalQueue = new LinkedList<>();
    private PriorityQueue<Call> vipQueue = new PriorityQueue<>((a, b) -> Boolean.compare(b.isVip, a.isVip));
    private Map<String, Integer> callCount = new HashMap<>();

    public void receiveCall(String id, boolean vip) {
        Call call = new Call(id, vip);
        if (vip) vipQueue.add(call);
        else normalQueue.add(call);

        callCount.put(id, callCount.getOrDefault(id, 0) + 1);
    }

    public Call serveCall() {
        if (!vipQueue.isEmpty()) return vipQueue.poll();
        return normalQueue.poll();
    }

    public int getCallCount(String id) {
        return callCount.getOrDefault(id, 0);
    }
}
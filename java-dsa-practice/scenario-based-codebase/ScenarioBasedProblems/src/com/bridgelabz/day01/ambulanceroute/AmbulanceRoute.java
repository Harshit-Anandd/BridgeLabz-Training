package com.bridgelabz.day01.ambulanceroute;

public class AmbulanceRoute {
    private HospitalUnit head;

    public void addUnit(String name) {
        HospitalUnit unit = new HospitalUnit(name);

        if (head == null) {
            head = unit;
            head.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = unit;
        unit.next = head;
    }

    public HospitalUnit findAvailableUnit() {
        if (head == null) return null;

        HospitalUnit temp = head;
        do {
            if (temp.available) return temp;
            temp = temp.next;
        } while (temp != head);

        return null;
    }

    public boolean removeUnit(String name) {
        if (head == null) return false;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {
                if (prev != null) {
                    prev.next = curr.next;
                }
                if (curr == head) {
                    head = curr.next;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        return false;
    }
}
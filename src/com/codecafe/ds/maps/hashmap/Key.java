package com.codecafe.ds.maps.hashmap;

// custom Key class to override hashCode() and equals() method
public class Key {

    private String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = (int) key.charAt(0);
        System.out.println("hashCode for key : " + key + " = " + hash);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return key.equals(((Key) obj).key);
    }

}
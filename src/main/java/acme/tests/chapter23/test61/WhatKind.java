package acme.tests.chapter23.test61;

import java.util.*;
public class WhatKind {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ja"));
        ResourceBundle rb = ResourceBundle.getBundle("pod.container");
        String name = rb.getString("name"); // r1
        String type = rb.getString("type"); // r2
        System.out.println(name + " " + type); }
}

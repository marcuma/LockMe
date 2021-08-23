package com.simplilearn.lockme.service;

import java.util.Scanner;

/**
 * Created: 08/22/2021 - 9:39 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public final class Utility {

    private Utility() {
    }

    public static String getInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}

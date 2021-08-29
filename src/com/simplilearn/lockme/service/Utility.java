package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;

import java.util.HashSet;
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

    public static void sort(Credential[] credentials) {

        for (int lastIndex = credentials.length - 1; lastIndex > 0; lastIndex--) {
            for(int i = 0; i < lastIndex; i++) {
                if (credentials[i].getSiteName().toUpperCase().compareTo(
                        credentials[i + 1].getSiteName().toUpperCase()) > -1) {
                    swap(credentials, i, i + 1);
                }
            }
        }
    }

    private static void swap(Credential[] creds, int a, int b) {
        if( a == b) {
            return;
        }
        Credential tmp = creds[a];
        creds[a] = creds[b];
        creds[b] = tmp;

    }
}

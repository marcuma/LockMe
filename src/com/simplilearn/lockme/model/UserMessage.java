package com.simplilearn.lockme.model;

/**
 * Created: 08/28/2021 - 5:14 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public final class UserMessage {
    private static String userMessage = "";

    public static String getUserMessage() {
        return userMessage;
    }

    public static void setUserMessage(String userMessage) {
        UserMessage.userMessage = userMessage;
    }
}

package io.github.homchom.recode.mod.features.social.chat.message;

public enum MessageType {
    OTHER,

    // ----------------------------------

    // General
    DIRECT_MESSAGE(true),
    PLOT_AD(true),

    // Support
    SUPPORT,
    SUPPORT_QUESTION(true),
    SUPPORT_ANSWER(true),

    // Moderation
    MODERATION,
    INCOMING_REPORT,
    SILENT_PUNISHMENT,
    SCANNING(2),
    TELEPORTING,
    JOIN_FAIL,

    // Admin
    SPIES,
    ADMIN,

    // Custom regex
    STREAMER_MODE_REGEX;

    // ----------------------------------

    private final int messageAmount;
    private final boolean hasSound;

    MessageType() {
        this(1);
    }

    MessageType(int messageAmount) {
        this(messageAmount, false);
    }

    MessageType(boolean hasSound) {
        this(1, hasSound);
    }

    MessageType(int messageAmount, boolean hasSound) {
        this.messageAmount = messageAmount;
        this.hasSound = hasSound;
    }

    public int getMessageAmount() {
        return messageAmount;
    }

    public boolean hasSound() {
        return hasSound;
    }

    public boolean is(MessageType compareTo) {
        return this == compareTo;
    }
}

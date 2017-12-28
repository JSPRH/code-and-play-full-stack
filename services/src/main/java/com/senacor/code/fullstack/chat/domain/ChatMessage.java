package com.senacor.code.fullstack.chat.domain;

import java.time.Instant;
import java.util.Objects;

/**
 * Domain model for chat message.
 */
public class ChatMessage {

    private String id;

    private String channel;

    private String sender;

    private String message;

    private Instant creationTimestamp;

    public ChatMessage() {
        this.creationTimestamp = Instant.now();
    }

    public ChatMessage(String channel, String sender, String message) {
        this();
        this.channel = channel;
        this.sender = sender;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessage that = (ChatMessage) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(channel, that.channel) &&
                Objects.equals(sender, that.sender) &&
                Objects.equals(message, that.message) &&
                Objects.equals(creationTimestamp, that.creationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, channel, sender, message, creationTimestamp);
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id=" + id +
                ", channel='" + channel + '\'' +
                ", sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                '}';
    }
}
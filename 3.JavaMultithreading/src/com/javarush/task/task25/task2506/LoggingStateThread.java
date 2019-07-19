package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;
    State lastState, state;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        this.lastState = null;
        this.state = thread.getState();
    }

    @Override
    public void run() {
        do {

            state = thread.getState();

            if (lastState != state) {
                System.out.println(state);
                lastState = state;
            }

        } while (state != State.TERMINATED);
    }
}

package com.learn.thread.basic.inter_thread_communication.producerconsumer_non_thraed_save_common_object;

import lombok.Getter;
import lombok.Setter;

/*
 We will use this class as a lock in Thread1 and Thread2
*/

@Getter
@Setter
public class Message {
    private String message;
    Message(String message){
        this.message=message;
    }
}

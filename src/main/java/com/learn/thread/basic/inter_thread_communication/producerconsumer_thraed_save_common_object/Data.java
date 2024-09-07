package com.learn.thread.basic.inter_thread_communication.producerconsumer_thraed_save_common_object;

public class Data {
    private String packet;
    private boolean transfer=true;

    public synchronized void send(String packet){
        while(!transfer){
            try{
                wait();
            }
            catch (Exception e){

            }
        }
        transfer=false;
        this.packet=packet;
        notifyAll();
    }
    public synchronized String receive(){
        /*
         - Loop mai isliye daala hai kyoke multiple thread data receive kar sakte hai.
         - sender data send karne ke baad transfer ko false kar deta hai.
         - notifyAll ke case mai sare waiting thread notify ho jaayege but thread scheduler ek ek karke chance dega
           unko run hone ka.
         - to jub pahela thread run hoga to sabse pahele while mai firse jaayega and check karega ke
           transfer ke value kya hai , is time usko false he milege to while loop se bahar aa jayega
           and transfer ke value true set kardega and data receive kar lega
         - ab jub doosra thread runhoga to vo bhe while loop mai jaayega but is time transfer ke value true ho
           chuki hai is liye vo firse wait mai chala jaayega.


        */

        while(transfer){
            try{
                wait();
            }catch (Exception e){

            }
        }
        transfer=true;
        notifyAll();
        System.out.println("Data successfully received by -"+ Thread.currentThread());
        return packet;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

/**
 *
 * @author Recoban10
 */
public interface Messenger {
    void sendMessage(String receiver, String subject, String messege);
}

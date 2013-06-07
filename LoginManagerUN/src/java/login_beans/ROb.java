/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login_beans;

/**
 *
 * @author Sebastian
 */
public class ROb {
    //Return Object
    
    boolean success;
    String err_message;
    Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErr_message() {
        return err_message;
    }

    public void setErr_message(String err_message) {
        this.err_message = err_message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

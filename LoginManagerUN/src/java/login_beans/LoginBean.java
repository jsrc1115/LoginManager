package login_beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sebastian
 */
@ManagedBean(name="LoginBean")
@SessionScoped
public class LoginBean implements Serializable {
    
    public void doLogin()
    {
        
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("http://localhost:8080/AdministradorServiciosUN");
        } catch (IOException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}

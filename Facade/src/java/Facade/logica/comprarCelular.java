/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.logica;

/**
 *
 * @author Usuario
 */
public class comprarCelular {
    
    private huawei huawei = new huawei();
    private iphone iphone = new iphone();
    private samsung samsung = new samsung();
    
    
    
    public String iphoneSale(){
        return iphone.modeloiphone() + " a un precio de "
                +iphone.precioiphone();
    }
    
    public String samsungSale(){
        return samsung.modelosamsung()+" a un precio de "
        +samsung.preciosamsung();
    }
    
    
    public String huaweiSale(){
       return huawei.modelohuawei()+ " a un precio de "
               +huawei.preciohuawei();
    }
}

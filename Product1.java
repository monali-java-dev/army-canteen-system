/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army.canteen.management.system;

/**
 *
 * @author IIS
 */
class Product1 {

     private int pId,cId,pQuantity,pPrice;
     private String pName;
    public Product1(int pId,int cId,String pName,int pQuantity,int pPrice)
    {
        this.pId = pId;
        this.cId = cId;
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.pPrice = pPrice;
    }
    
    public int getId()
        {
            return pId;
        }
    
    public String getName()
        {
            return pName;
        }
    
    public int getCid()
        {
            return cId;
        }
    
    public int getQuantity()
        {
            return pQuantity;
        }
    
    public int getPrice()
        {
            return pPrice;
        }
    
}

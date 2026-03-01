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
class TotalBill {

     private int product_quantity,product_rate,total;
     private String product_name;
    public TotalBill(String product_name,int product_quantity,int product_rate,int total)
    {
        this.product_name = product_name;
        this.product_quantity = product_quantity;
        this.product_rate = product_rate;
        this.total = total;
  }
    
    public String getProduct_Name()
        {
            return product_name;
        }
    
    public int getproduct_quantity()
        {
            return product_quantity;
        }
    
    public int getproduct_rate()
        {
            return product_rate;
        }
    
    public int gettotal()
        {
            return total;
        }
  }

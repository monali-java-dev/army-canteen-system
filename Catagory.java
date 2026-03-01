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
class Catagory {
    
 private int cId;
   private String cName;
    public Catagory(int cId,String cName)
    {
        this.cId = cId;
        this.cName = cName;
      
    }
    
    public int getId()
        {
            return cId;
        }
    
    public String getName()
        {
            return cName;
        }
  
}


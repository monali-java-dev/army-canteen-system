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
class Staff {
   private int sId,sSalary;
   private String sName,SAddress,SMobile;
    public Staff(int sId,String sName,String SAddress,String SMobile,int sSalary)
    {
        this.sId = sId;
        this.sName = sName;
        this.SAddress = SAddress;
        this.SMobile = SMobile;
        this.sSalary = sSalary;
    }
    
    public int getId()
        {
            return sId;
        }
    
    public String getName()
        {
            return sName;
        }
    
    public String getAddress()
        {
            return SAddress;
        }
    
    public String getMobile()
        {
            return SMobile;
        }
    
    public int getSalary()
        {
            return sSalary;
        }
}

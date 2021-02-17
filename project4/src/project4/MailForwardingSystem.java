package project4;

import java.util.ArrayList;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class MailForwardingSystem {

    private ArrayList<UserInfo> fwdList;

    /**
     * Default constructor of UserInfo object.
     */
    public MailForwardingSystem() {
        this.fwdList = new ArrayList<>();
    }

    /**
     * Method to check the forwarding address of the customer
     *
     * @param customer name of customer
     * @param address forwarding mail address
     * @return string with the address.
     */
    public String mail(String customer, String address) {
        // for each iteration of fwdList, check to see if the user
        // has an address to forward their mail too. If they do, 
        // return the new address
        for (UserInfo i : fwdList) {
            if (i.getOldAdd().equals(address) && i.getCosName().equals(customer)) {
                String update = i.getNewAdd();
                return update;
            }
        }
        // if not, then return the address inputed.
        return address;
    }

    /**
     * Method to add a new forwarding address. Return false if there is already
     * an input that is the same.
     *
     * @param customer name of customer
     * @param oldAddress customer's old mailing address
     * @param newAddress customer's new mailing address
     * @return boolean if the mailing address is added or not
     */
    public boolean add(String customer, String oldAddress, String newAddress) {
        // for each iteration of fwdList, compare the UserInfo with 
        // the new input. If they are the same return false,
        for (UserInfo i : fwdList) {
            if (i.getNewAdd().equals(newAddress)
                    && i.getCosName().equals(customer)
                    && i.getOldAdd().equals(oldAddress)) {
                return false;
            }
        }
        // add the input to the fwdList if there are no comparrisons
        fwdList.add(new UserInfo(customer, oldAddress, newAddress));
        return true;
    }

    /**
     * Method to remove an address from the forwarding list
     *
     * @param customer name of the customer
     * @param oldAddress customer's old mailing address
     * @param newAddress customer's new mailing address
     * @return true if the mailing address is removed.
     */
    public boolean remove(String customer, String oldAddress, String newAddress) {
        // For each iteration of fwdList, compare UserInfo with 
        // the new input. If the input is the same as what is on
        // the fwdList, remove it from the list and return true.
        for (UserInfo i : fwdList) {
            if (i.getNewAdd().equals(newAddress)
                    && i.getCosName().equals(customer)
                    && i.getOldAdd().equals(oldAddress)) {
                fwdList.remove(i);
                return true;
            }
        }
        // if there is no comparrisons, return false.
        return false;
    }
}

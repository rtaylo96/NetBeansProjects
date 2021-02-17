package project4;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class UserInfo {

    private String cosName;
    private String oldAdd; 
    private String newAdd;

    /**
     * Constructor Creates UserInfo objects that hold the user's name, the old
     * address on the forwarding list, and the new address on the forwarding
     * list.
     *
     * @param cosName the name of the customer
     * @param oldAdd the old address of the user on the forwarding list
     * @param newAdd the new address of the user
     */
    public UserInfo(String cosName, String oldAdd, String newAdd) {
        this.cosName = cosName;
        this.oldAdd = oldAdd;
        this.newAdd = newAdd;
    }

    /**
     * Gets the costumers name
     *
     * @return the costumers name
     */
    public String getCosName() {
        return cosName;
    }

    /**
     * Sets the costumers name.
     *
     * @param cosName the name of the costumer
     */
    public void setCosName(String cosName) {
        this.cosName = cosName;
    }

    /**
     * Gets the user's old address
     *
     * @return the user's old address
     */
    public String getOldAdd() {
        return oldAdd;
    }

    /**
     * Sets the user's old address
     *
     * @param oldAdd the user's old address
     */
    public void setOldAdd(String oldAdd) {
        this.oldAdd = oldAdd;
    }

    /**
     * Gets the user's new address
     *
     * @return the user's new address
     */
    public String getNewAdd() {
        return newAdd;
    }

    /**
     * Sets the user's new address
     *
     * @param newAdd the user's new address
     */
    public void setNewAdd(String newAdd) {
        this.newAdd = newAdd;
    }
}

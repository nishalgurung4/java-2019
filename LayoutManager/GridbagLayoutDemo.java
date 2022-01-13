import java.awt.*;

public class GridbagLayoutDemo extends Frame {
    GridBagLayout gblOne;
    public GridbagLayoutDemo (String title) {
        super(title);

        gblOne = new GridBagLayout();
        GridBagConstraints gbcOne = new GridBagConstraints();
        setLayout(gblOne);


        Checkbox windows = new Checkbox("Windows",true);
        Checkbox android = new Checkbox("Android");
        Checkbox solaris = new Checkbox("Solaris");


        /* Define object of GridBagLayout */

        /* Use column weight of 1 */
        gbcOne.weightx = 1.0; 
        gbcOne.ipadx = 0;
        gbcOne.anchor = GridBagConstraints.NORTHEAST;
        gblOne.setConstraints(windows, gbcOne);
        gblOne.setConstraints(android, gbcOne);

        add(windows);
        add(android);
        add(solaris);

    }
    public static void main(String[] args) {
        GridbagLayoutDemo gblObject = new GridbagLayoutDemo("Grid bag layout");
        gblObject.setSize (300,400);
        gblObject.setVisible(true);
    }
}
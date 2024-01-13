import javax.swing.JOptionPane;
public class gui{
    public static void main(String[]args){
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hellow "+name);
        int age=Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"you are "+age+" year old!");
        Double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your Height in inche"));
        JOptionPane.showMessageDialog(null,"you are "+height+" inches tall");
        
    }

}
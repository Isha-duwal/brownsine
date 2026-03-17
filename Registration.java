import javax.swing.*;
class Registration
{
public static void main(String args[])
{
 

String day[] = new String[31];
for(int i = 1;i<=31;i++)
{
day[i-1] = "";
day[i-1] = day[i-1] + i;
}
 

String year[] = new String[118];
int y = 1909;
for(int i = 0;i<=117;i++)
{
 

year[i] = "" + (y+i); 
}
 

String month[] = {"January","February","March","April","May","June",
                  "July","August","September","October","November","December"};
 

 

JFrame frm = new JFrame("Membership Registration");
JPanel pnl = new JPanel();
 

 

JLabel lbl = new JLabel("Membership Registration");
 

JLabel name = new JLabel("Name:");
JLabel age = new JLabel("Age:");
JLabel gender = new JLabel("Gender:");
JLabel lang = new JLabel("Language:");
JLabel dob = new JLabel("Date of Birth:");
 

 

JTextField namTxt = new JTextField(10);
JTextField ageTxt = new JTextField(10);
 

 

JRadioButton male = new JRadioButton("Male");
JRadioButton female = new JRadioButton("Female");
JRadioButton other = new JRadioButton("Other");
 

ButtonGroup G1 = new ButtonGroup();
 

 

JCheckBox cSharp = new JCheckBox("C#");
JCheckBox jjava = new JCheckBox("Java");
JCheckBox  python = new JCheckBox("Python");
 

JComboBox years = new JComboBox(year);
JComboBox months = new JComboBox(month);
JComboBox days = new JComboBox(day);
 

JButton submit = new JButton("Submit");
 

pnl.add(lbl);
pnl.add(name);
pnl.add(namTxt);
pnl.add(age);
pnl.add(ageTxt);
 
pnl.add(gender);
pnl.add(male);
pnl.add(female);
pnl.add(other);
 

G1.add(male);
G1.add(female);
G1.add(other);
 

pnl.add(lang);
pnl.add(cSharp);
pnl.add(jjava);
pnl.add(python);
 

pnl.add(dob);
pnl.add(years);
pnl.add(months);
pnl.add(days);
pnl.add(submit);
 

frm.add(pnl);
frm.setVisible(true);
frm.setSize(500,500);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
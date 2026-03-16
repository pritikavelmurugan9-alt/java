import javax.swing.*;
public class SwingComponentsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        
        JLabel label = new JLabel("Enter Name:");
        label.setBounds(20,20,100,25);
        panel.add(label);

        
        JTextField textField = new JTextField();
        textField.setBounds(120,20,150,25);
        panel.add(textField);

        
        JButton button = new JButton("Submit");
        button.setBounds(300,20,100,25);
        panel.add(button);

        
        JToggleButton toggle = new JToggleButton("ON/OFF");
        toggle.setBounds(20,60,100,30);
        panel.add(toggle);

        
        String items[] = {"Java","Python","C++","JavaScript"};
        JList<String> list = new JList<>(items);

        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(20,110,120,80);
        panel.add(listScroll);

       
        JTextArea textArea = new JTextArea();
        JScrollPane areaScroll = new JScrollPane(textArea);
        areaScroll.setBounds(180,110,200,120);
        panel.add(areaScroll);

        frame.add(panel);
        frame.setVisible(true);
    }
}
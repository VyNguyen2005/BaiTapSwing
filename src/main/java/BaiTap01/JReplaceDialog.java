/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap01;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nguye
 */
public class JReplaceDialog extends JDialog{
    private JLabel lblFirst, lblEnd;
    private JTextField txtFirst, txtEnd;
    private JButton btnReplace, btnReplaceAll;
    private MyNotepad parent;
    public JReplaceDialog(Frame owner, boolean modal) {
        super(owner, modal);
        setTitle("Replace");
        parent = (MyNotepad)owner;
        createGUI();
        createEventProcess();
        setSize(450, 230);
        setLocationRelativeTo(owner);
    }
    
    public static void main(String[] args) {
        JReplaceDialog replaceDialog = new JReplaceDialog(null, true);
        replaceDialog.setVisible(true);
        replaceDialog.setLocationRelativeTo(null);
    }

    private void createGUI() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(lblFirst = new JLabel("Nội dung trước: "));
        panel.add(lblEnd = new JLabel("Nội dung sau: "));
        panel.add(txtFirst = new JTextField());
        panel.add(txtEnd = new JTextField());
        panel.add(btnReplace = new JButton("Thay thế"));
        panel.add(btnReplaceAll = new JButton("Thay thế tất cả"));
        
        lblFirst.setBounds(30, 20, 120, 30);
        txtFirst.setBounds(180, 20, 200, 30);
        
        lblEnd.setBounds(30, 66, 140, 30);
        txtEnd.setBounds(180, 65, 200, 30);
        
        btnReplace.setBounds(100, 120, 100, 30);
        btnReplaceAll.setBounds(220, 120, 130, 30);
        
        add(panel);
    }

    private void createEventProcess() {
        btnReplace.addActionListener((e) -> {
            parent.replaceText(txtFirst.getText(), txtEnd.getText());
        });
        
    }
}

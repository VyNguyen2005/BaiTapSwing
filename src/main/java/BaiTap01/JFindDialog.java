/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap01;

import java.awt.Dialog;
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
public class JFindDialog extends JDialog{
    private JLabel lblEnterText;
    private JTextField txtEnterText;
    private JButton btnSearch, btnCancel;
    private MyNotepad parent;
    public JFindDialog(Frame owner, boolean modal) {
        super(owner, modal);
        setTitle("Find");
        parent = (MyNotepad)owner;
        createGUI();
        createEventProcess();
        setSize(450, 170);
        setLocationRelativeTo(owner);
    }
    
    public static void main(String[] args) {
        JFindDialog findDialog = new JFindDialog(null, true);
        findDialog.setVisible(true);
        findDialog.setLocationRelativeTo(null);
    }

    private void createGUI() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(lblEnterText = new JLabel("Nhập nội dung tìm kiếm: "));
        panel.add(txtEnterText = new JTextField());
        panel.add(btnSearch = new JButton("Tìm kiếm"));
        panel.add(btnCancel = new JButton("Hủy"));
        
        lblEnterText.setBounds(30, 20, 140, 30);
        txtEnterText.setBounds(180, 20, 200, 30);
        btnSearch.setBounds(100, 70, 100, 30);
        btnCancel.setBounds(220, 70, 100, 30);
        add(panel);
    }

    private void createEventProcess() {
        btnSearch.addActionListener((e) -> {
            parent.findText(txtEnterText.getText());
        });
        btnCancel.addActionListener((e) -> {
            this.dispose();
        });
    }
    
}

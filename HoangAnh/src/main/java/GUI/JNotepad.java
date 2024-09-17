package GUI;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
public class JNotepad extends JFrame{
    private JMenuBar mBar;
    private JMenu mFile,mEdit,mFormat,mView,mHelp,mZoom;
    private JMenuItem itemSelectAll,itemAboutNotepad,itemSendFeedback,itemViewHelp,itemStatusBar,itemRestoredefaultzoom,itemZoomin,itemZoomout,itemWrap,itemFont,itemNew,itemOpen,itemSave,itemSaveAs,itemPageSetup,itemPrint,itemExit,itemUndo,itemCut,itemCopy,itemPaste,itemDelete,itemSearchwithBing,itemFind,itemFindnext,itemFindPrevious,itemReplace,itemGoto,itemSelectall,itemTimedate;
    private JTextArea txtEditor;
    private JScrollPane scrollEditor;
    public JNotepad(String title)
    {
        super(title);
        CreateMenu();
        createGUI();
        txtEditor=new JTextArea();
        JScrollPane scrollEditor = new JScrollPane(txtEditor);
        add(scrollEditor);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);   
    }

    private void CreateMenu() {
   mBar=new JMenuBar();
   mBar.add(mFile=new JMenu("File"));
   //File
   mFile.add(mEdit=new JMenu("Edit"));
   mFile.add(itemNew=new JMenuItem("New"));
   mFile.add(itemOpen=new JMenuItem("Open..."));
   mFile.add(itemSave=new JMenuItem("Save"));
   mFile.add(itemSaveAs=new JMenuItem("Save As..."));
   mFile.addSeparator();
   mFile.add(itemPageSetup=new JMenuItem("Page Setup..."));
   mFile.add(itemPrint=new JMenuItem("Print..."));
   mFile.addSeparator();
   mFile.add(itemExit=new JMenuItem("Exit"));
   //Edit
   mEdit.add(itemUndo=new JMenuItem("Undo"));
   mEdit.add(itemCut=new JMenuItem("Cut"));
   mEdit.add(itemCopy=new JMenuItem("Copy"));
   mEdit.add(itemPaste=new JMenuItem("Paste"));
   mEdit.add(itemDelete=new JMenuItem("Delete"));
   mEdit.add(itemSearchwithBing=new JMenuItem("Search with Bing..."));
   mEdit.add(itemFind=new JMenuItem("Find..."));
   mEdit.add(itemFindnext=new JMenuItem("Find Next"));
   mEdit.add(itemFindPrevious=new JMenuItem("Find Previous"));
   mEdit.add(itemReplace=new JMenuItem("Replace..."));
   mEdit.add(itemGoto=new JMenuItem("Go to..."));
   mEdit.add(itemSelectall=new JMenuItem("Select All"));
   mEdit.add(itemTimedate=new JMenuItem("Time/Date"));
 //format
   mFormat.add(itemWrap = new JCheckBoxMenuItem("Word Wrap",true));
   mFormat.add(itemFont = new JMenuItem("Font..."));
   //gắn phím nóng
   mView.add(mZoom=new JMenu("Zoom"));
   mZoom.add(itemZoomin=new JMenuItem("Zoom in"));
   mZoom.add(itemZoomout=new JMenuItem("Zoom out"));
   mZoom.add(itemRestoredefaultzoom=new JMenuItem("Restore Default Zoom"));
   mView.add(itemStatusBar = new JCheckBoxMenuItem("Status Bar", true));
   //tạo các item add vào thực đơn Help
   mHelp.add(itemViewHelp = new JMenuItem("View Help"));
   mHelp.add(itemSendFeedback = new JMenuItem("Send Feedback"));
   mHelp.addSeparator();
   mHelp.add(itemAboutNotepad = new JMenuItem("About Notepad"));
        setJMenuBar(mBar);
   //tạo tổ hợp phím nóng   
   itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
   itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
   itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
   itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK+ KeyEvent.SHIFT_DOWN_MASK));
   itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,KeyEvent.CTRL_DOWN_MASK));
//edit
        itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        itemSearchwithBing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
        itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        itemZoomin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
        itemZoomout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.CTRL_DOWN_MASK));
        itemRestoredefaultzoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        itemFindnext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        itemFindPrevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, KeyEvent.SHIFT_DOWN_MASK));
       itemTimedate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));

    }
    public static void main(String[] args) {
        JNotepad notepad =new JNotepad("Demo NotePad");
        notepad.setVisible(true);
    }
//    private void createGUI(){
//        txtEditor = new JTextArea();
//        JScrollPane scrollEditor =new JScrollPane(txtEditor);
//        add(scrollEditor);
//        txtEditor.setFont(new Font("Arial",Font.PLAIN,20));
//    }
}


    import java.awt.Desktop;  
    import java.net.URL;  
      
    import javax.swing.JEditorPane;  
    import javax.swing.JFrame;  
    import javax.swing.SwingUtilities;  
    import javax.swing.event.HyperlinkEvent;  
    import javax.swing.event.HyperlinkListener;  
      
    public class QQNews extends JFrame {  
          
        private JEditorPane newsPane;  
        private String newsURL = "http://en.weather.com.cn/"; // 
          
        public QQNews() {  
              
            try {  
                newsPane = new JEditorPane(new URL(newsURL));  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
              
            newsPane.addHyperlinkListener(new HyperlinkListener() {  
                @Override  
                public void hyperlinkUpdate(HyperlinkEvent e) {  
                    if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {  
                        Desktop browser = Desktop.getDesktop();  
                        try {  
                            browser.browse(e.getURL().toURI());  
                        } catch (Exception e1) {  
                            e1.printStackTrace();  
                        }  
                    }  
                }  
            });  
            newsPane.setEditable(false);  
            add(newsPane);  
            setSize(600, 550);  
            setVisible(true);  
        }  
          
        /** 
         * @param args 
         */  
        public static void main(String[] args) {  
            SwingUtilities.invokeLater(new Runnable() {  
                public void run() {  
                    new QQNews();  
                }  
            });  
        }  
    }  
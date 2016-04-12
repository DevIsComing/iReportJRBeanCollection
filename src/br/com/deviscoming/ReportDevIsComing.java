/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deviscoming;

import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author renan.ramos
 */
public class ReportDevIsComing {

    /**
     * @param args the command line arguments
     */        
    public static void main(String[] args) {
        new ReportDevIsComing();
    }

    public ReportDevIsComing() {
        execute();
    }

    private void execute() {
        ClienteFactory clienteFactory = new ClienteFactory();
        List<Cliente> lista = (List) clienteFactory.getCliente();
        geraRelatorio(lista);
    }            
        
    private void geraRelatorio(List<Cliente> lista) {
        try{            
            URL arquivo = getClass().getResource("/br/com/deviscoming/relatorio/relDevComing.jasper");                                  
            JasperReport report = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));
            JasperViewer jasperViewer = new JasperViewer(print, false );
            jasperViewer.setVisible(true);                        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }
    
}

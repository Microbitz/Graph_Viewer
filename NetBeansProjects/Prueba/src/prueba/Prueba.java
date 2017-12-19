package prueba;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.fazecast.jSerialComm.SerialPort;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    
	static SerialPort chosenPort;
	static int x1 = 0;
	static int x2 = 0;
	static int x3 = 0;
	static int x4 = 0;
	static String value;
    
    public static void main(String[] args) {

       		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
		
		//Declaracion de ventene Principal
				JFrame window = new JFrame("MT Serial Monitor");
				window.setVisible(true);
				window.setSize(1000, 835);
				window.setResizable(false);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JPanel panel = new JPanel();
			    panel.setLayout(null);
			    
			    
		//Generar Grafica
			    
		        XYSeries series1 = new XYSeries("Lectura de Señal 01");
		        XYSeriesCollection dataset1 = new XYSeriesCollection(series1);
		        JFreeChart chart1= ChartFactory.createXYLineChart("Lectura de Señal 01", "(Tiempo Segundos)", "Lectura 4-20ma", dataset1); 
		        XYPlot plot1 = chart1.getXYPlot();
		        XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
			    renderer1.setSeriesPaint(0, Color.BLUE);
		        plot1.setRenderer(renderer1);
			    
		        XYSeries series2 = new XYSeries("Lectura de Señal 02");
		        XYSeriesCollection dataset2 = new XYSeriesCollection(series2);
		        JFreeChart chart2= ChartFactory.createXYLineChart("Lectura de Señal 02", "(Tiempo Segundos)", "Lectura 4-20ma", dataset2); 
		        XYPlot plot2 = chart2.getXYPlot();
		        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
			    renderer2.setSeriesPaint(0, Color.GREEN);
		        plot2.setRenderer(renderer2);
		        
		        XYSeries series3 = new XYSeries("Lectura de Señal 03");
		        XYSeriesCollection dataset3 = new XYSeriesCollection(series3);
		        JFreeChart chart3= ChartFactory.createXYLineChart("Lectura de Señal 03", "(Tiempo Segundos)", "Lectura 4-20ma", dataset3); 
		        XYPlot plot3 = chart3.getXYPlot();
		        XYLineAndShapeRenderer renderer3 = new XYLineAndShapeRenderer();
			    renderer3.setSeriesPaint(0, Color.YELLOW);
		        plot3.setRenderer(renderer3);
		        
		        XYSeries series4 = new XYSeries("Lectura de Señal 04");
		        XYSeriesCollection dataset4 = new XYSeriesCollection(series4);
		        JFreeChart chart4= ChartFactory.createXYLineChart("Lectura de Señal 04", "(Tiempo Segundos)", "Lectura 4-20ma", dataset4); 
		        XYPlot plot4 = chart4.getXYPlot();
		        XYLineAndShapeRenderer renderer4 = new XYLineAndShapeRenderer();
			    renderer4.setSeriesPaint(0, Color.RED);
		        plot4.setRenderer(renderer4);
		        
		        ChartPanel chartPanel1 = new ChartPanel(chart1);
		        ChartPanel chartPanel2 = new ChartPanel(chart2);
		        ChartPanel chartPanel3 = new ChartPanel(chart3);
		        ChartPanel chartPanel4 = new ChartPanel(chart4);
		        
		        chartPanel1.setBounds(0, 0, 400, 400);
		        chartPanel2.setBounds(0, 400, 400, 400);
		        chartPanel3.setBounds(400, 0, 400, 400);
		        chartPanel4.setBounds(400, 400, 400, 400);
		        
		        window.add(chartPanel1);
		        window.add(chartPanel2);
		        window.add(chartPanel3);
		        window.add(chartPanel4);
			    
		//Dibujar Opciones de conexion
		        JLabel label = new JLabel();
		        JLabel label1 = new JLabel("",SwingConstants.CENTER);
		        JLabel label2 = new JLabel("",SwingConstants.CENTER);
		        JLabel label3 = new JLabel("",SwingConstants.CENTER);
		        JLabel label4 = new JLabel("",SwingConstants.CENTER);
		        JLabel label5 = new JLabel("",SwingConstants.CENTER);
		        JLabel label6 = new JLabel("",SwingConstants.CENTER);
		        JLabel label7 = new JLabel("",SwingConstants.CENTER);
		        JLabel label8 = new JLabel("",SwingConstants.CENTER);   
		        JLabel labelV1 = new JLabel("Señal_1:");
		        JLabel labelV2 = new JLabel("Señal_2:");
		        JLabel labelV3 = new JLabel("Señal_3:");
		        JLabel labelV4 = new JLabel("Señal_4:");
		        JLabel labelV5 = new JLabel("Señal_5:");
		        JLabel labelV6 = new JLabel("Señal_6:");
		        JLabel labelV7 = new JLabel("Señal_7:");
		        JLabel labelV8 = new JLabel("Señal_8:");   
		        
		        
		        JButton connectButton = new JButton();
		        JComboBox<String> portlist = new JComboBox<String>();
		        connectButton.setBounds(850, 20, 130, 20);
		        
		        label.setBounds(850, 50, 130, 20);
		        label.setBackground(Color.WHITE);
		        label.setOpaque(true);
		        
		        label1.setBounds(900, 120, 60, 20);
		        label1.setBackground(Color.WHITE);
		        label1.setOpaque(true);
		        
		        label2.setBounds(900, 150, 60, 20);
		        label2.setBackground(Color.WHITE);
		        label2.setOpaque(true);
		        
		        label3.setBounds(900, 180, 60, 20);
		        label3.setBackground(Color.WHITE);
		        label3.setOpaque(true);
		        
		        label4.setBounds(900, 210, 60, 20);
		        label4.setBackground(Color.WHITE);
		        label4.setOpaque(true);
		        
		        label5.setBounds(900, 240, 60, 20);
		        label5.setBackground(Color.WHITE);
		        label5.setOpaque(true);
		        
		        label6.setBounds(900, 270, 60, 20);
		        label6.setBackground(Color.WHITE);
		        label6.setOpaque(true);
		        
		        label7.setBounds(900, 300, 60, 20);
		        label7.setBackground(Color.WHITE);
		        label7.setOpaque(true);
		        
		        label8.setBounds(900, 330, 60, 20);
		        label8.setBackground(Color.WHITE);
		        label8.setOpaque(true);
		        
		        labelV1.setBounds(850, 120, 60, 20);
		        
		        labelV2.setBounds(850, 150, 60, 20);
		        
		        labelV3.setBounds(850, 180, 60, 20);
		        
		        labelV4.setBounds(850, 210, 60, 20);
		        
		        labelV5.setBounds(850, 240, 60, 20);
		        
		        labelV6.setBounds(850, 270, 60, 20);
		        
		        labelV7.setBounds(850, 300, 60, 20);
		        
		        labelV8.setBounds(850, 330, 60, 20);
		        
		        portlist.setBounds(850, 80, 130, 20);

		        connectButton.setText("Conectar");
		        panel.add(connectButton);
		        panel.add(label);
		        panel.add(label1);
		        panel.add(label2);
		        panel.add(label3);
		        panel.add(label4);
		        panel.add(label5);
		        panel.add(label6);
		        panel.add(label7);
		        panel.add(label8);
		        panel.add(labelV1);
		        panel.add(labelV2);
		        panel.add(labelV3);
		        panel.add(labelV4);
		        panel.add(labelV5);
		        panel.add(labelV6);
		        panel.add(labelV7);
		        panel.add(labelV8);
		        panel.add(portlist);
				
		        window.add(panel);
		        

		        
		//Selecionar ComPort
		        
		        SerialPort[] portNames = SerialPort.getCommPorts();
		        for(int i = 0; i < portNames.length; i++)
		        portlist.addItem(portNames[i].getSystemPortName());
		        
		//Cuando Presiono el boton
		      //Boton de Conectar
		        connectButton.addActionListener(new ActionListener() {
		        	@Override
		        	public void actionPerformed(ActionEvent arg0) {
		        		if(connectButton.getText().equals("Conectar")) {
		        			// Intento de conexion al puerto
		        			chosenPort = SerialPort.getCommPort(portlist.getSelectedItem().toString());
		        			chosenPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		        			if(chosenPort.openPort()) {
		        				connectButton.setText("Desconectar");
		        				portlist.setEnabled(false);
		        			}
		        			
		        			// crear datos para actualizar el Grafico
		        			
		        			Thread thread = new Thread() {
		        				@Override public void run() {
		        					int [] matrix=new int[8];
		        					Scanner scanner = new Scanner(chosenPort.getInputStream());
		        					while(scanner.hasNextLine()) {
		        						try {
		        						String line = scanner.nextLine();
		        						Scanner Recibido = new Scanner(line);
		        						
		        						while(Recibido.hasNextInt()){
		        					    System.out.println(Recibido.nextInt());
		        						for(int i=0;i<7;i++) {
		        						matrix[i]=Recibido.nextInt();
		                                }
		        						label.setText(line);
		                    			label1.setText(String.valueOf(matrix[0]));
		            					label2.setText(String.valueOf(matrix[1]));
		            					label3.setText(String.valueOf(matrix[2]));
		            					label4.setText(String.valueOf(matrix[3]));
		                    			label5.setText(String.valueOf(matrix[4]));
		            					label6.setText(String.valueOf(matrix[5]));
		            					label7.setText(String.valueOf(matrix[6]));
		            					label8.setText(String.valueOf(matrix[7]));
		            					
		            					//Graficar
		        				        int number1 = Integer.parseInt(label1.getText());
		        				        series1.add(x1++,number1 );
		        				        
		        				        int number2 = Integer.parseInt(label2.getText());
		        				        series2.add(x2++,number2 );
		        				        
		        				        int number3 = Integer.parseInt(label3.getText());
		        				        series3.add(x3++,number3 );
		        				        
		        				        int number4 = Integer.parseInt(label4.getText());
		        				        series4.add(x4++,number4 );
		        						};
		        						window.repaint();
		        						}catch(Exception e) {}

		        					}
		        					scanner.close();
		        				}
		        			};
		        			thread.start();        			       			
		        		} else {
		        			// desconectarse del puerto
		        			chosenPort.closePort();
		        			portlist.setEnabled(true);
		        			connectButton.setText("Conectar");
		        			label1.setText("");
							label2.setText("");
							label3.setText("");
							label4.setText("");
		        			x1 = 0;
		        			x2 = 0;
		        			x3 = 0;
		        			x4 = 0;
		        		}
		        	}
		        	
		        });



		        // Mostrar Ventana

		        window.setVisible(true);        
		         
        
        
        
    }
    
}

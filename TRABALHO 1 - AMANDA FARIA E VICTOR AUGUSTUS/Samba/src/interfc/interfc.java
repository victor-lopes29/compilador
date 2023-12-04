package interfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Cursor;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;

import parser.ParseException;
import parser.SimpleNode;
import parser.Aula1;
import recovery.RecoverySet;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Insets;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.ComponentOrientation;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class interfc {

	private JFrame frame;
	private int Tela;
	private String localArquivo;
	private JList<String> Lpanel_linha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfc window = new interfc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textAreaArquivo.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 15));
		textAreaArquivo.setFont(textAreaArquivo.getFont().deriveFont(Font.BOLD));
		Lpanel_linha = new JList<>();
		Lpanel_linha.setModel(new DefaultListModel<String>());
		
		JScrollPane scrollPane = new JScrollPane();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Novo");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		menuBar.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser openFile = new JFileChooser();
				openFile.showOpenDialog(openFile);
				Tela = JFileChooser.OPEN_DIALOG;
				if (JFileChooser.APPROVE_OPTION == Tela) {
					localArquivo = openFile.getSelectedFile().toString();
					AbrirArquivo();
				}
			}
		});
		
		Lpanel_linha = new JList<>();
		Lpanel_linha.setModel(new DefaultListModel<String>());
		LineNumberRenderer lineNumberRenderer = new LineNumberRenderer(Color.BLUE);
		Lpanel_linha.setCellRenderer(lineNumberRenderer);
		
		Lpanel_linha.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					int selectedIndex = Lpanel_linha.getSelectedIndex();
					if (selectedIndex != -1) {
						try {
							String[] lines = textAreaArquivo.getText().split("\n");
							if (selectedIndex < lines.length) {
								String selectedLine = lines[selectedIndex];
								JOptionPane.showMessageDialog(frame, selectedLine, "Valor da Linha",
										JOptionPane.INFORMATION_MESSAGE);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salvar");
		menuBar.add(mntmNewMenuItem_2);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(352, 40, 178, 158);
		panel.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(25, 269, 505, 76);
		panel.add(textArea_2);
		
		JLabel lblNewLabel = new JLabel("Console");
		lblNewLabel.setBounds(25, 246, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Árvore Sintática");
		lblNewLabel_1.setBounds(352, 17, 150, 13);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Executar");
		btnNewButton.setBounds(352, 208, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(445, 208, 85, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Arquivo Fonte");
		lblNewLabel_2.setBounds(25, 17, 132, 13);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(25, 40, 317, 189);
		panel.add(scrollPane_2);
		
		JTextArea textAreaArquivo = new JTextArea();
		scrollPane_2.setViewportView(textAreaArquivo);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_2.setRowHeaderView(scrollPane_2);
		
		
		
		JList Lpanel_linha = new JList();
		Lpanel_linha.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		scrollPane_1.setRowHeaderView(Lpanel_linha);
		
	}
	
	@SuppressWarnings("serial")
	class LineNumberRenderer extends DefaultListCellRenderer {
		private Color lineNumberColor;

		public LineNumberRenderer(Color lineNumberColor) {
			this.lineNumberColor = lineNumberColor;
		}

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

			setForeground(lineNumberColor);

			return component;
		}
	}
	
	private void AbrirArquivo() {
		try {
			FileReader fileReader = new FileReader(localArquivo);
			BufferedReader reader = new BufferedReader(fileReader);
			DefaultListModel<String> listModel = new DefaultListModel<>();
			String line;
			int lineNumber = 1;
			while ((line = reader.readLine()) != null) {
				textAreaArquivo.append(line + "\n");
				listModel.addElement("" + lineNumber++);
			}
			fileReader.close();
			reader.close();
			Lpanel_linha.setModel(listModel);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
	}
	
	private javax.swing.JTextArea textAreaArquivo;
}

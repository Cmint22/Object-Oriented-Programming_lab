package hust.soict.dsai.swing;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class AWTAccumulator.
 */
public class AWTAccumulator extends Frame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The tf input. */
	private TextField tfInput;
	
	/** The tf output. */
	private TextField tfOutput;
	
	/** The sum. */
	private int sum = 0;	//Accumulated sum, init to 0
	
	/**
	 * Instantiates a new AWT accumulator.
	 */
	//Constructor to setup the CUI components and event handlers
	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2));
		add(new Label("Enter an Integer: "));
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		add(new Label("The Accumulated Sum is: "));
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new AWTAccumulator();
	}
	
	/**
	 * The listener interface for receiving TFInput events.
	 * The class that is interested in processing a TFInput
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTFInputListener<code> method. When
	 * the TFInput event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TFInputEvent
	 */
	private class TFInputListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param evt the evt
		 */
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
	}

}

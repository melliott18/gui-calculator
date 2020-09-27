import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener
{
	private JTextField calcField;
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton plus;
	private JButton minus;
	private JButton times;
	private JButton divide;
	private JButton square;
	private JButton squareroot;
	private JButton log;
	private JButton ln;
	private JButton factorial;
	private JButton e;
	private JButton pi;
	private JButton equals;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton point;
	private JButton percent;
	private JButton clear;
	private String curr;
	private String prev = "";
	private static double a, b, result;
	private static int operator;
	
	Calculator()
	{
		a = 0;
		b = 0;
		result = 0;
	    operator = 0;
		
		JPanel jPanel = new JPanel(new GridBagLayout());
	    GridBagConstraints gridBag = new GridBagConstraints();
		
		setTitle("Calculator");
		
		this.getContentPane().setBackground(Color.WHITE);
		
		calcField = new JTextField("", 36);
		calcField.setMinimumSize(calcField.getPreferredSize());
	    calcField.setEditable(false);
	    calcField.setText("");
	    
	    zero = new JButton(" 0 ");
	    one = new JButton(" 1 ");
	    two = new JButton(" 2 ");
	    three = new JButton(" 3 ");
	    four = new JButton(" 4 ");
	    five = new JButton(" 5 ");
	    six = new JButton(" 6 ");
	    seven = new JButton(" 7 ");
	    eight = new JButton(" 8 ");
	    nine = new JButton(" 9 ");
	    plus = new JButton(" + ");
	    minus = new JButton(" - ");
	    times = new JButton(" * ");
	    divide = new JButton(" / ");
	    square = new JButton(" ^2 ");
	    squareroot = new JButton(" ^1/2 ");
	    log = new JButton(" log ");
	    ln = new JButton(" ln ");
	    factorial = new JButton(" X! ");
	    e = new JButton(" e ");
	    pi = new JButton(" pi ");
	    equals = new JButton(" = ");
	    sin = new JButton(" sin ");
	    cos = new JButton(" cos ");
	    tan = new JButton(" tan ");
	    point = new JButton(" . ");
	    percent = new JButton(" % ");
	    clear = new JButton(" Clear ");
	    
	    zero.addActionListener(this);
	    one.addActionListener(this);
	    two.addActionListener(this);
	    three.addActionListener(this);
	    four.addActionListener(this);
	    five.addActionListener(this);
	    six.addActionListener(this);
	    seven.addActionListener(this);
	    eight.addActionListener(this);
	    nine.addActionListener(this);
	    plus.addActionListener(this);
	    minus.addActionListener(this);
	    times.addActionListener(this);
	    divide.addActionListener(this);
	    square.addActionListener(this);
	    squareroot.addActionListener(this);
	    log.addActionListener(this);
	    ln.addActionListener(this);
	    factorial.addActionListener(this);
	    e.addActionListener(this);
	    pi.addActionListener(this);
	    equals.addActionListener(this);
	    sin.addActionListener(this);
	    cos.addActionListener(this);
	    tan.addActionListener(this);
	    point.addActionListener(this);
	    percent.addActionListener(this);
	    clear.addActionListener(this); 
		
		setLayout(new GridBagLayout());
	    gridBag = new GridBagConstraints();
	    
	    gridBag.gridx = 0;
	    gridBag.gridy = 0;
	    
	    gridBag.gridx = 0;
	    gridBag.gridy = 0;
	    gridBag.gridwidth = 6;
	    add(calcField, gridBag);
	    gridBag = new GridBagConstraints();
	    
	    gridBag.gridx = 2;
	    gridBag.gridy = 5;
	    gridBag.gridwidth = 2;
	    gridBag.fill = GridBagConstraints.HORIZONTAL;
	    add(zero, gridBag);
	    gridBag = new GridBagConstraints();
	    
	    gridBag.gridx = 2;
	    gridBag.gridy = 4;
	    add(one, gridBag);
	    
	    gridBag.gridx = 3;
	    gridBag.gridy = 4;
	    add(two, gridBag);
	    
	    gridBag.gridx = 4;
	    gridBag.gridy = 4;
	    add(three, gridBag);
	    
	    gridBag.gridx = 2;
	    gridBag.gridy = 3;
	    add(four, gridBag);
	    
	    gridBag.gridx = 3;
	    gridBag.gridy = 3;
	    add(five, gridBag);
	    
	    gridBag.gridx = 4;
	    gridBag.gridy = 3;
	    add(six, gridBag);
	    
	    gridBag.gridx = 2;
	    gridBag.gridy = 2;
	    add(seven, gridBag);
	    
	    gridBag.gridx = 3;
	    gridBag.gridy = 2;
	    add(eight, gridBag);
	    
	    gridBag.gridx = 4;
	    gridBag.gridy = 2;
	    add(nine, gridBag);
	    
	    gridBag.gridx = 5;
	    gridBag.gridy = 4;
	    add(plus, gridBag);
	    
	    gridBag.gridx = 5;
	    gridBag.gridy = 3;
	    add(minus, gridBag);
	    
	    gridBag.gridx = 5;
	    gridBag.gridy = 2;
	    add(times, gridBag);
	    
	    gridBag.gridx = 5;
	    gridBag.gridy = 1;
	    add(divide, gridBag);
	    
	    gridBag.gridx = 0;
		gridBag.gridy = 1;
		add(square, gridBag);
		
		gridBag.gridx = 0;
		gridBag.gridy = 2;
		squareroot.setPreferredSize(new Dimension(75, 30));
		add(squareroot, gridBag);
		
		gridBag.gridx = 0;
		gridBag.gridy = 3;
		add(log, gridBag);
		
		gridBag.gridx = 0;
		gridBag.gridy = 4;
		add(ln, gridBag);
		
		gridBag.gridx = 0;
		gridBag.gridy = 5;
		add(factorial, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 4;
		add(e, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 5;
		add(pi, gridBag);
	    
	    gridBag.gridx = 5;
		gridBag.gridy = 5;
		add(equals, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 1;
		add(sin, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 2;
		add(cos, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 3;
		add(tan, gridBag);
	    
	    gridBag.gridx = 4;
	    gridBag.gridy = 5;
	    add(point, gridBag);
	    
	    gridBag.gridx = 4;
	    gridBag.gridy = 1;
	    add(percent, gridBag);
	    
	    gridBag.gridx = 2;
		gridBag.gridy = 1;
		gridBag.gridwidth = 2;
		gridBag.fill = GridBagConstraints.HORIZONTAL;
		add(clear, gridBag);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == zero) {
            calcField.setText(calcField.getText().concat("0"));
            prev = "zero";
		}
		
		if (event.getSource() == one) {
            calcField.setText(calcField.getText().concat("1"));
            prev = "one";
		}
		
		if (event.getSource() == two) {
            calcField.setText(calcField.getText().concat("2"));
            prev = "two";
		}
		
		if (event.getSource() == three) {
            calcField.setText(calcField.getText().concat("3"));
            prev = "three";
		}
		
		if (event.getSource() == four) {
            calcField.setText(calcField.getText().concat("4"));
            prev = "four";
		}
		
		if (event.getSource() == five) {
            calcField.setText(calcField.getText().concat("5"));
            prev = "five";
		}
		
		if (event.getSource() == six) {
            calcField.setText(calcField.getText().concat("6"));
            prev = "six";
		}
		
		if (event.getSource() == seven) {
            calcField.setText(calcField.getText().concat("7"));
            prev = "seven";
		}
		
		if (event.getSource() == eight) {
            calcField.setText(calcField.getText().concat("8"));
            prev = "eight";
		}
		
		if (event.getSource() == nine) {
            calcField.setText(calcField.getText().concat("9"));
            prev = "nine";
		}
		
		if (event.getSource() == point && !prev.equals("point")) {
			calcField.setText(calcField.getText().concat("."));
            prev = "point";
		}
		
		if (event.getSource() == e && !prev.equals("e")) {
            calcField.setText(calcField.getText().concat(Math.E + ""));
            prev = "e";
		}
		
		if (event.getSource() == pi && !prev.equals("pi")) {
            calcField.setText(calcField.getText().concat(Math.PI + ""));
            prev = "pi";
		}

		if (event.getSource() == plus) {
            a = Double.parseDouble(calcField.getText());
            operator = 1;
            calcField.setText("");
            prev = "plus";
        } 
        
        if (event.getSource() == minus) {
            a = Double.parseDouble(calcField.getText());
            operator = 2;
            calcField.setText("");
            prev = "minus";
        }
        
        if (event.getSource() == times) {
            a = Double.parseDouble(calcField.getText());
            operator = 3;
            calcField.setText("");
            prev = "times";
        }
        
        if (event.getSource() == divide) {
            a = Double.parseDouble(calcField.getText());
            operator = 4;
            calcField.setText("");
            prev = "divide";
        }
        
        if (event.getSource() == square) {
            a = Double.parseDouble(calcField.getText());
            operator = 5;
            calcField.setText("");
            prev = "square";
        }
        
        if (event.getSource() == squareroot) {
            a = Double.parseDouble(calcField.getText());
            operator = 6;
            calcField.setText("");
            prev = "squareroot";
        }

        if (event.getSource() == log) {
            a = Double.parseDouble(calcField.getText());
            operator = 7;
            calcField.setText("");
            prev = "log";
        }
        
        if (event.getSource() == ln) {
            a = Double.parseDouble(calcField.getText());
            operator = 8;
            calcField.setText("");
            prev = "ln";
        }
        
        if (event.getSource() == factorial) {
            a = Double.parseDouble(calcField.getText());
            operator = 9;
            calcField.setText("");
            prev = "factorial";
        }
        
        if (event.getSource() == sin) {
            a = Double.parseDouble(calcField.getText());
            operator = 10;
            calcField.setText("");
            prev = "sin";
        }
        
        if (event.getSource() == cos) {
            a = Double.parseDouble(calcField.getText());
            operator = 11;
            calcField.setText("");
            prev = "cos";
        }
        
        if (event.getSource() == tan) {
            a = Double.parseDouble(calcField.getText());
            operator = 12;
            calcField.setText("");
            prev = "tan";
        }
        
        if (event.getSource() == percent) {
            a = Double.parseDouble(calcField.getText());
            operator = 13;
            calcField.setText("");
            prev = "percent";
        }
        
        if (event.getSource() == equals) {   
            switch (operator) {
                case 1: b = Double.parseDouble(calcField.getText());
                	result = a + b;
                    break;
        
                case 2: b = Double.parseDouble(calcField.getText());
                	result = a - b;
                    break;
        
                case 3: b = Double.parseDouble(calcField.getText());
                	result = a * b;
                    break;
        
                case 4: b = Double.parseDouble(calcField.getText());
                	result = a / b;
                    break;
                    
                case 5: result = Math.pow(a, 2);
                	break;
                	
                case 6: result = Math.sqrt(a);
                	break;
                	
                case 7: result = Math.log10(a);
                	break;
                	
                case 8: result = Math.log(a);
                	break;
                	
                case 9:
                	result = factorial((int) a);
                	break;
                	
                case 10: result = Math.sin(a);
                	break;
                	
                case 11: result = Math.cos(a);
            		break;
            		
                case 12: result = Math.tan(a);
            		break;
            		
                case 13: result = a / 100.0;
                	break;
                	
                default: result = 0;
            }
        
            String string = Double.toString(result);
    	    String s = new DecimalFormat("0.####").format(Double.parseDouble(string));
            calcField.setText(s);
            prev = "equals";
        }
        
        if (event.getSource() == clear) {
        	calcField.setText("");
        }
	}
	
	private int factorial(int n)
	{
		int output;
		
	    if (n == 0 || n == 1) {
	    	return 1;
	    }
	    
	    output = factorial(n - 1) * n;
	    return output;
	}

	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    c.pack();
	    c.setVisible(true);
	}
}

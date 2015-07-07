import java.util.ArrayList;


public class Lab4_1 {

	public static void main(String[] args) {
		
	      ArrayList<Stock> market = new ArrayList<Stock>(); //market has several abilities: 
	      
	      // list a stock , by adding it tot he exchange
	      
	      //delist a stock, once it drops below a certain price or stock allotment
	      
	      //update the price of something on the exchange
		
	      double industrialPriceIndex = 0.0 ;
		
	      for(int i = 0; i <= 5000; i++) //a stock market
	      {
	    	 // Stock n = new Stock();
	    	  String symbol = "ESI" +i; 
	    	  Stock stock = new Stock(symbol, "Jacob's Ladder Company");
	    	  double x = i * 1.0;
		      stock.setPreviousClosingPrice(x);

		      // Set current price
		      double multiple = i * 1.0;
		      double pricing = (65.0 * multiple); 
		      stock.setCurrentPrice(pricing );
		      //every time we set the price of a stock, add it to the industrial average
		      industrialPriceIndex =  stock.getCurrentPrice() + industrialPriceIndex; //populates the list of all prices
//		      // Display stock info
//		      System.out.println("Symbol: " + stock.getSymbol());
//		      System.out.println("Previous Closing Price: " +
//		        stock.getPreviousClosingPrice());
//		      System.out.println("Current Price: " +
//		        stock.getCurrentPrice());
//		      System.out.println("Price Change: " +
//		        stock.getChangePercent() * 1);
		      
		      stock.lastTradePrice = 55.0;//adjust public variables directly
		      
		      market.add(stock);//list it
	      }
	      
	      for(Stock s : market)//traverse the array list, for all stock symbols
	      {
	    	 System.out.println("current price of "+ s.getSymbol() + " is " + s.getCurrentPrice());
	      }
	      
	      System.out.println("market size is " + market.size() + " with current average " + getIndustrialAverage(industrialPriceIndex));
	    }

	public static double getIndustrialAverage(double total)
	{
		return total / 5000 * 1.0;
	}
	
	}

class Stock {
//	  String getSymbol;
//	  String getName;
	  double previousClosingPrice; //member variables
	  private double currentPrice;
	  
	  private String symbol = ""; //symbol, as it appears on the exchange
	  private String name = ""; //corporations' actual name
	  
	  public double lastTradePrice = 0.0; 

	  public Stock() {
	  }

	  public Stock(String Symbol, String Name) //CONSTRUCTOR, THROWN EACH TIME A NEW OBJECT IS CREATED
	  {
	    this.symbol = Symbol;
	    this.name = Name;
	   
	  }
	  
	  /**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;//instance variables
	}

	public String getSymbol(){
		  return this.symbol;
		  
	  }
	  
	  public String name(){
		  return this.name;
		  
	  }

	  public double getChangePercent() {
	    return (currentPrice - previousClosingPrice) /
	      previousClosingPrice;
	  }
	  
	  public double getPreviousClosingPrice() {
	    return previousClosingPrice;
	  }
	  
	  public double getCurrentPrice() {
	    return currentPrice;
	  }
	  
	  public void setCurrentPrice(double price) {
	    this.currentPrice = price;
	  }
	  
	  public void setPreviousClosingPrice(double price) {
	    previousClosingPrice = price;
	  }
	  
//	  public void setgetSymbol(String Symbol) {
//		getSymbol = Symbol;
//	  }
//	  
//	  public void setname(String name) {
//		  getName = name;
//	  }
	  

	}

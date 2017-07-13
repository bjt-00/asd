package asd.labs.lab2.stock_market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StockMarket {
	protected List<AbstractMarket> marketList = new ArrayList<AbstractMarket>();
	Map<String,Double> stocklist = new HashMap<String,Double>();
	
	public void attach(AbstractMarket abstractMarket){
		marketList.add(abstractMarket);
	}


	public void addStock(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
		notifyStockMarket();
	}
	
	public void update(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
		notifyStockMarket();
	}

	public Map<String,Double> getStockList(){
		return stocklist;
	}
   public void notifyStockMarket(){
	   marketList.forEach(s->{s.update();});
   }

}
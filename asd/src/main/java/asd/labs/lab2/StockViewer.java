package asd.labs.lab2;

public class StockViewer extends AbstractMarket {
	
	public StockViewer(StockMarket stockMarket){
		this.stockMarket = stockMarket;
		this.stockMarket.attach(this);
	}

@Override
public void update() {
	System.out.println("StockViewer: stocklist is changed:");
	stockMarket.getStockList().forEach((k,v)->{System.out.println("StockViewer" + k + " - $" + v);});
}
}
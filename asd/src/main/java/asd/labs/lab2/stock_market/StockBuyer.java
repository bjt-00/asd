package asd.labs.lab2.stock_market;

public class StockBuyer extends AbstractMarket {
	public StockBuyer(StockMarket stockMarket){
		this.stockMarket = stockMarket;
		this.stockMarket.attach(this);
	}

	@Override
	public void update() {
		System.out.println("StockBuyer: stocklist is changed:");
		stockMarket.getStockList().forEach((k,v)->{System.out.println(k + " - $" + v);});
	}
}
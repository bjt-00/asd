package asd.labs.lab2.stock_market;

public class Application {
	public static void main(String[] args) {
		StockMarket market = new StockMarket();
		StockBuyer buyer = new StockBuyer(market);
		StockViewer viewer = new StockViewer(market);
		
		market.addStock("ORC", 12.23);
		market.addStock("MSC", 45.78);
		market.update("ORC", 12.34);
		market.update("MSC", 44.68);
		}
}

/*
StockBuyer: stocklist is changed:
ORC - $12.34
MSC - $45.78
StockViewer: stocklist is changed:
StockViewerORC - $12.34
StockViewerMSC - $45.78
StockBuyer: stocklist is changed:
ORC - $12.34
MSC - $44.68
StockViewer: stocklist is changed:
StockViewerORC - $12.34
StockViewerMSC - $44.68
*/
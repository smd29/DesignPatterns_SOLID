package lld.design.facade;

// Facade 
public class OrderProcessor {
    
    // private InventoryService inventoryService;
    // public AnalyticsService analyticsService;
    private WarehouseProcessor warehouseProcessor;
    public RecommendationService recommendationService;
    public PaymentService paymentService;

    public void process(){
        // inventoryService.checkInventory();
        // analyticsService.track();
        warehouseProcessor.proces();
        recommendationService.recommend();
        paymentService.pay();
    }
}

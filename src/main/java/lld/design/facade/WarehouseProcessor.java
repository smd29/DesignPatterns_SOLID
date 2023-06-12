package lld.design.facade;

// Additional Facade
public class WarehouseProcessor {
    // InventoryService + analyticsService
    private InventoryService inventoryService;
    public AnalyticsService analyticsService;

    public void proces(){
        inventoryService.checkInventory();
        analyticsService.track();
    }

}

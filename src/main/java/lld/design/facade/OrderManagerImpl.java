package lld.design.facade;

public class OrderManagerImpl implements OrderManager{

    // OrderManager will have dependencies on various diff services

    // Commented as it is violating SRP --> moving to orderprocessor.java
    // private InventoryService inventoryService;
    // public AnalyticsService analyticsService;
    // public RecommendationService recommendationService;
    // public PaymentService paymentService;

    private OrderProcessor orderProcessor;

    @Override
    public void createOrder() {
        // Store it in db

        // Commented as it is violating SRP --> moving to orderprocessor.java
        // inventoryService.checkInventory();
        // analyticsService.track();
        // recommendationService.recommend();
        // paymentService.pay();
        orderProcessor.process();
        
    }
    
    
}

// God class - not maintainable
// not extensible
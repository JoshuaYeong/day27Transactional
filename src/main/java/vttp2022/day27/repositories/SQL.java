package vttp2022.day27.repositories;

public interface SQL {
    public static final String SQL_INSERT_PURCHASE_ORDER = 
        "insert into po(name, email) values(?,?)";
    
        public static final String SQL_INSERT_LINE_ITEM =
            "insert into line_item(ord_id, description, quantity, unit_price) values(?,?,?,?)";

        public static final String SQL_PURCHASE_ORDER_TOTAL = 
            "select count(*) from po";
    
}

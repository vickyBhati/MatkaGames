package com.dev.goldengames.model;

import java.util.List;

public class ProductModel {

    /**
     * data : {"id":"bc98fe7d-e7a4-0daa-7d6d-6071e1646920","name":"SI ","date_entered":"04/10/2021 17:33","date_modified":"04/10/2021 17:33","modified_user_id":"","modified_by_name":"","created_by":"","created_by_name":"","description":"","deleted":"0","created_by_link":"","modified_user_link":"","assigned_user_id":"1","assigned_user_name":"Administrator","assigned_user_link":"","SecurityGroups":"","billing_account_id":"","billing_account":"","billing_contact_id":"2a717948-a0a4-a7f9-0fd7-60615f1e0527","billing_contact":"","billing_address_street":"","billing_address_city":"","billing_address_state":"","billing_address_postalcode":"","billing_address_country":"","shipping_address_street":"","shipping_address_city":"","shipping_address_state":"","shipping_address_postalcode":"","shipping_address_country":"","number":"23","line_items":"","total_amt":"","total_amt_usdollar":"0.000000","subtotal_amount":"","subtotal_amount_usdollar":"0.000000","discount_amount":"","discount_amount_usdollar":"0.000000","tax_amount":"","tax_amount_usdollar":"0.000000","shipping_amount":"","shipping_amount_usdollar":"0.000000","shipping_tax":"","shipping_tax_amt":"","shipping_tax_amt_usdollar":"0.000000","total_amount":"1.000000","total_amount_usdollar":"0.023105","currency_id":"c5e3f05c-b566-5a96-8ddc-605742aaa62c","quote_number":"","quote_date":"04/10/2021","invoice_date":"04/10/2021","due_date":"","status":"","template_ddown_c":"","subtotal_tax_amount":"","subtotal_tax_amount_usdollar":"0.000000","accounts":"","contacts":"","aos_quotes_aos_invoices":"","aos_products_quotes":"","aos_line_item_groups":"","customer_id":"ac475a60-4c6f-f33b-ba35-60615ff3cb0e","customer_name":"","items":[{"id":"cc6cd4f4-ee58-49ed-8bba-6071e1d86d79","name":"tes","product_list_price":"1.000000","product_total_price":"1.000000","product_qty":"1.0000","parent_type":"AOS_Invoices","parent_id":"bc98fe7d-e7a4-0daa-7d6d-6071e1646920","group_id":"c994dd01-cc8e-ca3a-78e1-6071e16c5e2d","currency_id":"c5e3f05c-b566-5a96-8ddc-605742aaa62c"}]}
     * message : Success
     * status : 200
     * success : true
     */

    private DataBean data;
    private String message;
    private int status;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * id : bc98fe7d-e7a4-0daa-7d6d-6071e1646920
         * name : SI
         * date_entered : 04/10/2021 17:33
         * date_modified : 04/10/2021 17:33
         * modified_user_id :
         * modified_by_name :
         * created_by :
         * created_by_name :
         * description :
         * deleted : 0
         * created_by_link :
         * modified_user_link :
         * assigned_user_id : 1
         * assigned_user_name : Administrator
         * assigned_user_link :
         * SecurityGroups :
         * billing_account_id :
         * billing_account :
         * billing_contact_id : 2a717948-a0a4-a7f9-0fd7-60615f1e0527
         * billing_contact :
         * billing_address_street :
         * billing_address_city :
         * billing_address_state :
         * billing_address_postalcode :
         * billing_address_country :
         * shipping_address_street :
         * shipping_address_city :
         * shipping_address_state :
         * shipping_address_postalcode :
         * shipping_address_country :
         * number : 23
         * line_items :
         * total_amt :
         * total_amt_usdollar : 0.000000
         * subtotal_amount :
         * subtotal_amount_usdollar : 0.000000
         * discount_amount :
         * discount_amount_usdollar : 0.000000
         * tax_amount :
         * tax_amount_usdollar : 0.000000
         * shipping_amount :
         * shipping_amount_usdollar : 0.000000
         * shipping_tax :
         * shipping_tax_amt :
         * shipping_tax_amt_usdollar : 0.000000
         * total_amount : 1.000000
         * total_amount_usdollar : 0.023105
         * currency_id : c5e3f05c-b566-5a96-8ddc-605742aaa62c
         * quote_number :
         * quote_date : 04/10/2021
         * invoice_date : 04/10/2021
         * due_date :
         * status :
         * template_ddown_c :
         * subtotal_tax_amount :
         * subtotal_tax_amount_usdollar : 0.000000
         * accounts :
         * contacts :
         * aos_quotes_aos_invoices :
         * aos_products_quotes :
         * aos_line_item_groups :
         * customer_id : ac475a60-4c6f-f33b-ba35-60615ff3cb0e
         * customer_name :
         * items : [{"id":"cc6cd4f4-ee58-49ed-8bba-6071e1d86d79","name":"tes","product_list_price":"1.000000","product_total_price":"1.000000","product_qty":"1.0000","parent_type":"AOS_Invoices","parent_id":"bc98fe7d-e7a4-0daa-7d6d-6071e1646920","group_id":"c994dd01-cc8e-ca3a-78e1-6071e16c5e2d","currency_id":"c5e3f05c-b566-5a96-8ddc-605742aaa62c"}]
         */

        private String id;
        private String name;
        private String date_entered;
        private String date_modified;
        private String modified_user_id;
        private String modified_by_name;
        private String created_by;
        private String created_by_name;
        private String description;
        private String deleted;
        private String created_by_link;
        private String modified_user_link;
        private String assigned_user_id;
        private String assigned_user_name;
        private String assigned_user_link;
        private String SecurityGroups;
        private String billing_account_id;
        private String billing_account;
        private String billing_contact_id;
        private String billing_contact;
        private String billing_address_street;
        private String billing_address_city;
        private String billing_address_state;
        private String billing_address_postalcode;
        private String billing_address_country;
        private String shipping_address_street;
        private String shipping_address_city;
        private String shipping_address_state;
        private String shipping_address_postalcode;
        private String shipping_address_country;
        private String number;
        private String line_items;
        private String total_amt;
        private String total_amt_usdollar;
        private String subtotal_amount;
        private String subtotal_amount_usdollar;
        private String discount_amount;
        private String discount_amount_usdollar;
        private String tax_amount;
        private String tax_amount_usdollar;
        private String shipping_amount;
        private String shipping_amount_usdollar;
        private String shipping_tax;
        private String shipping_tax_amt;
        private String shipping_tax_amt_usdollar;
        private String total_amount;
        private String total_amount_usdollar;
        private String currency_id;
        private String quote_number;
        private String quote_date;
        private String invoice_date;
        private String due_date;
        private String status;
        private String template_ddown_c;
        private String subtotal_tax_amount;
        private String subtotal_tax_amount_usdollar;
        private String accounts;
        private String contacts;
        private String aos_quotes_aos_invoices;
        private String aos_products_quotes;
        private String aos_line_item_groups;
        private String customer_id;
        private String customer_name;
        private List<ItemsBean> items;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate_entered() {
            return date_entered;
        }

        public void setDate_entered(String date_entered) {
            this.date_entered = date_entered;
        }

        public String getDate_modified() {
            return date_modified;
        }

        public void setDate_modified(String date_modified) {
            this.date_modified = date_modified;
        }

        public String getModified_user_id() {
            return modified_user_id;
        }

        public void setModified_user_id(String modified_user_id) {
            this.modified_user_id = modified_user_id;
        }

        public String getModified_by_name() {
            return modified_by_name;
        }

        public void setModified_by_name(String modified_by_name) {
            this.modified_by_name = modified_by_name;
        }

        public String getCreated_by() {
            return created_by;
        }

        public void setCreated_by(String created_by) {
            this.created_by = created_by;
        }

        public String getCreated_by_name() {
            return created_by_name;
        }

        public void setCreated_by_name(String created_by_name) {
            this.created_by_name = created_by_name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDeleted() {
            return deleted;
        }

        public void setDeleted(String deleted) {
            this.deleted = deleted;
        }

        public String getCreated_by_link() {
            return created_by_link;
        }

        public void setCreated_by_link(String created_by_link) {
            this.created_by_link = created_by_link;
        }

        public String getModified_user_link() {
            return modified_user_link;
        }

        public void setModified_user_link(String modified_user_link) {
            this.modified_user_link = modified_user_link;
        }

        public String getAssigned_user_id() {
            return assigned_user_id;
        }

        public void setAssigned_user_id(String assigned_user_id) {
            this.assigned_user_id = assigned_user_id;
        }

        public String getAssigned_user_name() {
            return assigned_user_name;
        }

        public void setAssigned_user_name(String assigned_user_name) {
            this.assigned_user_name = assigned_user_name;
        }

        public String getAssigned_user_link() {
            return assigned_user_link;
        }

        public void setAssigned_user_link(String assigned_user_link) {
            this.assigned_user_link = assigned_user_link;
        }

        public String getSecurityGroups() {
            return SecurityGroups;
        }

        public void setSecurityGroups(String SecurityGroups) {
            this.SecurityGroups = SecurityGroups;
        }

        public String getBilling_account_id() {
            return billing_account_id;
        }

        public void setBilling_account_id(String billing_account_id) {
            this.billing_account_id = billing_account_id;
        }

        public String getBilling_account() {
            return billing_account;
        }

        public void setBilling_account(String billing_account) {
            this.billing_account = billing_account;
        }

        public String getBilling_contact_id() {
            return billing_contact_id;
        }

        public void setBilling_contact_id(String billing_contact_id) {
            this.billing_contact_id = billing_contact_id;
        }

        public String getBilling_contact() {
            return billing_contact;
        }

        public void setBilling_contact(String billing_contact) {
            this.billing_contact = billing_contact;
        }

        public String getBilling_address_street() {
            return billing_address_street;
        }

        public void setBilling_address_street(String billing_address_street) {
            this.billing_address_street = billing_address_street;
        }

        public String getBilling_address_city() {
            return billing_address_city;
        }

        public void setBilling_address_city(String billing_address_city) {
            this.billing_address_city = billing_address_city;
        }

        public String getBilling_address_state() {
            return billing_address_state;
        }

        public void setBilling_address_state(String billing_address_state) {
            this.billing_address_state = billing_address_state;
        }

        public String getBilling_address_postalcode() {
            return billing_address_postalcode;
        }

        public void setBilling_address_postalcode(String billing_address_postalcode) {
            this.billing_address_postalcode = billing_address_postalcode;
        }

        public String getBilling_address_country() {
            return billing_address_country;
        }

        public void setBilling_address_country(String billing_address_country) {
            this.billing_address_country = billing_address_country;
        }

        public String getShipping_address_street() {
            return shipping_address_street;
        }

        public void setShipping_address_street(String shipping_address_street) {
            this.shipping_address_street = shipping_address_street;
        }

        public String getShipping_address_city() {
            return shipping_address_city;
        }

        public void setShipping_address_city(String shipping_address_city) {
            this.shipping_address_city = shipping_address_city;
        }

        public String getShipping_address_state() {
            return shipping_address_state;
        }

        public void setShipping_address_state(String shipping_address_state) {
            this.shipping_address_state = shipping_address_state;
        }

        public String getShipping_address_postalcode() {
            return shipping_address_postalcode;
        }

        public void setShipping_address_postalcode(String shipping_address_postalcode) {
            this.shipping_address_postalcode = shipping_address_postalcode;
        }

        public String getShipping_address_country() {
            return shipping_address_country;
        }

        public void setShipping_address_country(String shipping_address_country) {
            this.shipping_address_country = shipping_address_country;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getLine_items() {
            return line_items;
        }

        public void setLine_items(String line_items) {
            this.line_items = line_items;
        }

        public String getTotal_amt() {
            return total_amt;
        }

        public void setTotal_amt(String total_amt) {
            this.total_amt = total_amt;
        }

        public String getTotal_amt_usdollar() {
            return total_amt_usdollar;
        }

        public void setTotal_amt_usdollar(String total_amt_usdollar) {
            this.total_amt_usdollar = total_amt_usdollar;
        }

        public String getSubtotal_amount() {
            return subtotal_amount;
        }

        public void setSubtotal_amount(String subtotal_amount) {
            this.subtotal_amount = subtotal_amount;
        }

        public String getSubtotal_amount_usdollar() {
            return subtotal_amount_usdollar;
        }

        public void setSubtotal_amount_usdollar(String subtotal_amount_usdollar) {
            this.subtotal_amount_usdollar = subtotal_amount_usdollar;
        }

        public String getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(String discount_amount) {
            this.discount_amount = discount_amount;
        }

        public String getDiscount_amount_usdollar() {
            return discount_amount_usdollar;
        }

        public void setDiscount_amount_usdollar(String discount_amount_usdollar) {
            this.discount_amount_usdollar = discount_amount_usdollar;
        }

        public String getTax_amount() {
            return tax_amount;
        }

        public void setTax_amount(String tax_amount) {
            this.tax_amount = tax_amount;
        }

        public String getTax_amount_usdollar() {
            return tax_amount_usdollar;
        }

        public void setTax_amount_usdollar(String tax_amount_usdollar) {
            this.tax_amount_usdollar = tax_amount_usdollar;
        }

        public String getShipping_amount() {
            return shipping_amount;
        }

        public void setShipping_amount(String shipping_amount) {
            this.shipping_amount = shipping_amount;
        }

        public String getShipping_amount_usdollar() {
            return shipping_amount_usdollar;
        }

        public void setShipping_amount_usdollar(String shipping_amount_usdollar) {
            this.shipping_amount_usdollar = shipping_amount_usdollar;
        }

        public String getShipping_tax() {
            return shipping_tax;
        }

        public void setShipping_tax(String shipping_tax) {
            this.shipping_tax = shipping_tax;
        }

        public String getShipping_tax_amt() {
            return shipping_tax_amt;
        }

        public void setShipping_tax_amt(String shipping_tax_amt) {
            this.shipping_tax_amt = shipping_tax_amt;
        }

        public String getShipping_tax_amt_usdollar() {
            return shipping_tax_amt_usdollar;
        }

        public void setShipping_tax_amt_usdollar(String shipping_tax_amt_usdollar) {
            this.shipping_tax_amt_usdollar = shipping_tax_amt_usdollar;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public String getTotal_amount_usdollar() {
            return total_amount_usdollar;
        }

        public void setTotal_amount_usdollar(String total_amount_usdollar) {
            this.total_amount_usdollar = total_amount_usdollar;
        }

        public String getCurrency_id() {
            return currency_id;
        }

        public void setCurrency_id(String currency_id) {
            this.currency_id = currency_id;
        }

        public String getQuote_number() {
            return quote_number;
        }

        public void setQuote_number(String quote_number) {
            this.quote_number = quote_number;
        }

        public String getQuote_date() {
            return quote_date;
        }

        public void setQuote_date(String quote_date) {
            this.quote_date = quote_date;
        }

        public String getInvoice_date() {
            return invoice_date;
        }

        public void setInvoice_date(String invoice_date) {
            this.invoice_date = invoice_date;
        }

        public String getDue_date() {
            return due_date;
        }

        public void setDue_date(String due_date) {
            this.due_date = due_date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTemplate_ddown_c() {
            return template_ddown_c;
        }

        public void setTemplate_ddown_c(String template_ddown_c) {
            this.template_ddown_c = template_ddown_c;
        }

        public String getSubtotal_tax_amount() {
            return subtotal_tax_amount;
        }

        public void setSubtotal_tax_amount(String subtotal_tax_amount) {
            this.subtotal_tax_amount = subtotal_tax_amount;
        }

        public String getSubtotal_tax_amount_usdollar() {
            return subtotal_tax_amount_usdollar;
        }

        public void setSubtotal_tax_amount_usdollar(String subtotal_tax_amount_usdollar) {
            this.subtotal_tax_amount_usdollar = subtotal_tax_amount_usdollar;
        }

        public String getAccounts() {
            return accounts;
        }

        public void setAccounts(String accounts) {
            this.accounts = accounts;
        }

        public String getContacts() {
            return contacts;
        }

        public void setContacts(String contacts) {
            this.contacts = contacts;
        }

        public String getAos_quotes_aos_invoices() {
            return aos_quotes_aos_invoices;
        }

        public void setAos_quotes_aos_invoices(String aos_quotes_aos_invoices) {
            this.aos_quotes_aos_invoices = aos_quotes_aos_invoices;
        }

        public String getAos_products_quotes() {
            return aos_products_quotes;
        }

        public void setAos_products_quotes(String aos_products_quotes) {
            this.aos_products_quotes = aos_products_quotes;
        }

        public String getAos_line_item_groups() {
            return aos_line_item_groups;
        }

        public void setAos_line_item_groups(String aos_line_item_groups) {
            this.aos_line_item_groups = aos_line_item_groups;
        }

        public String getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(String customer_id) {
            this.customer_id = customer_id;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * id : cc6cd4f4-ee58-49ed-8bba-6071e1d86d79
             * name : tes
             * product_list_price : 1.000000
             * product_total_price : 1.000000
             * product_qty : 1.0000
             * parent_type : AOS_Invoices
             * parent_id : bc98fe7d-e7a4-0daa-7d6d-6071e1646920
             * group_id : c994dd01-cc8e-ca3a-78e1-6071e16c5e2d
             * currency_id : c5e3f05c-b566-5a96-8ddc-605742aaa62c
             */

            private String id;
            private String name;
            private String product_list_price;
            private String product_total_price;
            private String product_qty;
            private String parent_type;
            private String parent_id;
            private String group_id;
            private String currency_id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProduct_list_price() {
                return product_list_price;
            }

            public void setProduct_list_price(String product_list_price) {
                this.product_list_price = product_list_price;
            }

            public String getProduct_total_price() {
                return product_total_price;
            }

            public void setProduct_total_price(String product_total_price) {
                this.product_total_price = product_total_price;
            }

            public String getProduct_qty() {
                return product_qty;
            }

            public void setProduct_qty(String product_qty) {
                this.product_qty = product_qty;
            }

            public String getParent_type() {
                return parent_type;
            }

            public void setParent_type(String parent_type) {
                this.parent_type = parent_type;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getGroup_id() {
                return group_id;
            }

            public void setGroup_id(String group_id) {
                this.group_id = group_id;
            }

            public String getCurrency_id() {
                return currency_id;
            }

            public void setCurrency_id(String currency_id) {
                this.currency_id = currency_id;
            }
        }
    }
}

package com.dev.goldengames.model;

public class ModelAddContact  {

    /**
     * data : {"type":"Contact","id":"8f3b4cc3-569e-e76c-f163-6033ddb6587b","attributes":{"name":"Rupesh Negi","date_entered":"2021-02-22T16:34:00+00:00","date_modified":"2021-02-22T16:34:00+00:00","modified_user_id":"1","modified_by_name":"Administrator","created_by":"1","created_by_name":"Administrator","description":"","deleted":"0","created_by_link":"","modified_user_link":"","assigned_user_id":"","assigned_user_name":"","assigned_user_link":"","SecurityGroups":"","salutation":"","first_name":"Rupesh","last_name":"Negi","full_name":"Rupesh Negi","title":"","photo":"","department":"","do_not_call":"0","phone_home":"","email":"","phone_mobile":"7788995544","phone_work":"","phone_other":"","phone_fax":"","email1":"","email2":"","invalid_email":"","email_opt_out":"","lawful_basis":"","date_reviewed":"","lawful_basis_source":"","primary_address_street":"","primary_address_street_2":"","primary_address_street_3":"","primary_address_city":"","primary_address_state":"","primary_address_postalcode":"","primary_address_country":"","alt_address_street":"","alt_address_street_2":"","alt_address_street_3":"","alt_address_city":"","alt_address_state":"","alt_address_postalcode":"","alt_address_country":"","assistant":"","assistant_phone":"","email_addresses_primary":"","email_addresses":"","email_addresses_non_primary":"","email_and_name1":"","lead_source":"","account_name":"","account_id":"","opportunity_role_fields":"","opportunity_role_id":"","opportunity_role":"","reports_to_id":"","report_to_name":"","birthdate":"","accounts":"","reports_to_link":{},"opportunities":"","bugs":"","calls":"","cases":"","direct_reports":"","emails":"","documents":"","leads":"","meetings":"","notes":"","project":"","project_resource":"","am_projecttemplates_resources":"","am_projecttemplates_contacts_1":"","tasks":"","tasks_parent":"","notes_parent":"","user_sync":{},"campaign_id":"","campaign_name":"","campaigns":"","campaign_contacts":{},"c_accept_status_fields":"","m_accept_status_fields":"","accept_status_id":"","accept_status_name":"","prospect_lists":"","sync_contact":"","fp_events_contacts":"","aos_quotes":"","aos_invoices":"","aos_contracts":"","e_invite_status_fields":"","event_status_name":"","event_invite_id":"","e_accept_status_fields":"","event_accept_status":"","event_status_id":"","project_contacts_1":"","aop_case_updates":"","joomla_account_id":"","portal_account_disabled":false,"joomla_account_access":"","portal_user_type":"Single","jjwg_maps_address_c":"","jjwg_maps_geocode_status_c":"","jjwg_maps_lat_c":"0.00000000","jjwg_maps_lng_c":"0.00000000"},"relationships":{"AM_ProjectTemplates":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/am_projecttemplates_contacts_1"}},"AOS_Contracts":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_contracts"}},"AOS_Invoices":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_invoices"}},"AOS_Quotes":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_quotes"}},"CampaignLog":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/campaigns"}},"EmailAddress":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/email_addresses"}},"Opportunities":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/opportunities"}},"Project":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/project_contacts_1"}},"ProspectLists":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/prospect_lists"}},"SecurityGroups":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/SecurityGroups"}},"Users":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/created_by_link"}}}}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * type : Contact
         * id : 8f3b4cc3-569e-e76c-f163-6033ddb6587b
         * attributes : {"name":"Rupesh Negi","date_entered":"2021-02-22T16:34:00+00:00","date_modified":"2021-02-22T16:34:00+00:00","modified_user_id":"1","modified_by_name":"Administrator","created_by":"1","created_by_name":"Administrator","description":"","deleted":"0","created_by_link":"","modified_user_link":"","assigned_user_id":"","assigned_user_name":"","assigned_user_link":"","SecurityGroups":"","salutation":"","first_name":"Rupesh","last_name":"Negi","full_name":"Rupesh Negi","title":"","photo":"","department":"","do_not_call":"0","phone_home":"","email":"","phone_mobile":"7788995544","phone_work":"","phone_other":"","phone_fax":"","email1":"","email2":"","invalid_email":"","email_opt_out":"","lawful_basis":"","date_reviewed":"","lawful_basis_source":"","primary_address_street":"","primary_address_street_2":"","primary_address_street_3":"","primary_address_city":"","primary_address_state":"","primary_address_postalcode":"","primary_address_country":"","alt_address_street":"","alt_address_street_2":"","alt_address_street_3":"","alt_address_city":"","alt_address_state":"","alt_address_postalcode":"","alt_address_country":"","assistant":"","assistant_phone":"","email_addresses_primary":"","email_addresses":"","email_addresses_non_primary":"","email_and_name1":"","lead_source":"","account_name":"","account_id":"","opportunity_role_fields":"","opportunity_role_id":"","opportunity_role":"","reports_to_id":"","report_to_name":"","birthdate":"","accounts":"","reports_to_link":{},"opportunities":"","bugs":"","calls":"","cases":"","direct_reports":"","emails":"","documents":"","leads":"","meetings":"","notes":"","project":"","project_resource":"","am_projecttemplates_resources":"","am_projecttemplates_contacts_1":"","tasks":"","tasks_parent":"","notes_parent":"","user_sync":{},"campaign_id":"","campaign_name":"","campaigns":"","campaign_contacts":{},"c_accept_status_fields":"","m_accept_status_fields":"","accept_status_id":"","accept_status_name":"","prospect_lists":"","sync_contact":"","fp_events_contacts":"","aos_quotes":"","aos_invoices":"","aos_contracts":"","e_invite_status_fields":"","event_status_name":"","event_invite_id":"","e_accept_status_fields":"","event_accept_status":"","event_status_id":"","project_contacts_1":"","aop_case_updates":"","joomla_account_id":"","portal_account_disabled":false,"joomla_account_access":"","portal_user_type":"Single","jjwg_maps_address_c":"","jjwg_maps_geocode_status_c":"","jjwg_maps_lat_c":"0.00000000","jjwg_maps_lng_c":"0.00000000"}
         * relationships : {"AM_ProjectTemplates":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/am_projecttemplates_contacts_1"}},"AOS_Contracts":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_contracts"}},"AOS_Invoices":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_invoices"}},"AOS_Quotes":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_quotes"}},"CampaignLog":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/campaigns"}},"EmailAddress":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/email_addresses"}},"Opportunities":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/opportunities"}},"Project":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/project_contacts_1"}},"ProspectLists":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/prospect_lists"}},"SecurityGroups":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/SecurityGroups"}},"Users":{"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/created_by_link"}}}
         */

        private String type;
        private String id;
        private AttributesBean attributes;
        private RelationshipsBean relationships;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public RelationshipsBean getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBean relationships) {
            this.relationships = relationships;
        }

        public static class AttributesBean {
            /**
             * name : Rupesh Negi
             * date_entered : 2021-02-22T16:34:00+00:00
             * date_modified : 2021-02-22T16:34:00+00:00
             * modified_user_id : 1
             * modified_by_name : Administrator
             * created_by : 1
             * created_by_name : Administrator
             * description :
             * deleted : 0
             * created_by_link :
             * modified_user_link :
             * assigned_user_id :
             * assigned_user_name :
             * assigned_user_link :
             * SecurityGroups :
             * salutation :
             * first_name : Rupesh
             * last_name : Negi
             * full_name : Rupesh Negi
             * title :
             * photo :
             * department :
             * do_not_call : 0
             * phone_home :
             * email :
             * phone_mobile : 7788995544
             * phone_work :
             * phone_other :
             * phone_fax :
             * email1 :
             * email2 :
             * invalid_email :
             * email_opt_out :
             * lawful_basis :
             * date_reviewed :
             * lawful_basis_source :
             * primary_address_street :
             * primary_address_street_2 :
             * primary_address_street_3 :
             * primary_address_city :
             * primary_address_state :
             * primary_address_postalcode :
             * primary_address_country :
             * alt_address_street :
             * alt_address_street_2 :
             * alt_address_street_3 :
             * alt_address_city :
             * alt_address_state :
             * alt_address_postalcode :
             * alt_address_country :
             * assistant :
             * assistant_phone :
             * email_addresses_primary :
             * email_addresses :
             * email_addresses_non_primary :
             * email_and_name1 :
             * lead_source :
             * account_name :
             * account_id :
             * opportunity_role_fields :
             * opportunity_role_id :
             * opportunity_role :
             * reports_to_id :
             * report_to_name :
             * birthdate :
             * accounts :
             * reports_to_link : {}
             * opportunities :
             * bugs :
             * calls :
             * cases :
             * direct_reports :
             * emails :
             * documents :
             * leads :
             * meetings :
             * notes :
             * project :
             * project_resource :
             * am_projecttemplates_resources :
             * am_projecttemplates_contacts_1 :
             * tasks :
             * tasks_parent :
             * notes_parent :
             * user_sync : {}
             * campaign_id :
             * campaign_name :
             * campaigns :
             * campaign_contacts : {}
             * c_accept_status_fields :
             * m_accept_status_fields :
             * accept_status_id :
             * accept_status_name :
             * prospect_lists :
             * sync_contact :
             * fp_events_contacts :
             * aos_quotes :
             * aos_invoices :
             * aos_contracts :
             * e_invite_status_fields :
             * event_status_name :
             * event_invite_id :
             * e_accept_status_fields :
             * event_accept_status :
             * event_status_id :
             * project_contacts_1 :
             * aop_case_updates :
             * joomla_account_id :
             * portal_account_disabled : false
             * joomla_account_access :
             * portal_user_type : Single
             * jjwg_maps_address_c :
             * jjwg_maps_geocode_status_c :
             * jjwg_maps_lat_c : 0.00000000
             * jjwg_maps_lng_c : 0.00000000
             */

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
            private String salutation;
            private String first_name;
            private String last_name;
            private String full_name;
            private String title;
            private String photo;
            private String department;
            private String do_not_call;
            private String phone_home;
            private String email;
            private String phone_mobile;
            private String phone_work;
            private String phone_other;
            private String phone_fax;
            private String email1;
            private String email2;
            private String invalid_email;
            private String email_opt_out;
            private String lawful_basis;
            private String date_reviewed;
            private String lawful_basis_source;
            private String primary_address_street;
            private String primary_address_street_2;
            private String primary_address_street_3;
            private String primary_address_city;
            private String primary_address_state;
            private String primary_address_postalcode;
            private String primary_address_country;
            private String alt_address_street;
            private String alt_address_street_2;
            private String alt_address_street_3;
            private String alt_address_city;
            private String alt_address_state;
            private String alt_address_postalcode;
            private String alt_address_country;
            private String assistant;
            private String assistant_phone;
            private String email_addresses_primary;
            private String email_addresses;
            private String email_addresses_non_primary;
            private String email_and_name1;
            private String lead_source;
            private String account_name;
            private String account_id;
            private String opportunity_role_fields;
            private String opportunity_role_id;
            private String opportunity_role;
            private String reports_to_id;
            private String report_to_name;
            private String birthdate;
            private String accounts;
            private ReportsToLinkBean reports_to_link;
            private String opportunities;
            private String bugs;
            private String calls;
            private String cases;
            private String direct_reports;
            private String emails;
            private String documents;
            private String leads;
            private String meetings;
            private String notes;
            private String project;
            private String project_resource;
            private String am_projecttemplates_resources;
            private String am_projecttemplates_contacts_1;
            private String tasks;
            private String tasks_parent;
            private String notes_parent;
            private UserSyncBean user_sync;
            private String campaign_id;
            private String campaign_name;
            private String campaigns;
            private CampaignContactsBean campaign_contacts;
            private String c_accept_status_fields;
            private String m_accept_status_fields;
            private String accept_status_id;
            private String accept_status_name;
            private String prospect_lists;
            private String sync_contact;
            private String fp_events_contacts;
            private String aos_quotes;
            private String aos_invoices;
            private String aos_contracts;
            private String e_invite_status_fields;
            private String event_status_name;
            private String event_invite_id;
            private String e_accept_status_fields;
            private String event_accept_status;
            private String event_status_id;
            private String project_contacts_1;
            private String aop_case_updates;
            private String joomla_account_id;
            private boolean portal_account_disabled;
            private String joomla_account_access;
            private String portal_user_type;
            private String jjwg_maps_address_c;
            private String jjwg_maps_geocode_status_c;
            private String jjwg_maps_lat_c;
            private String jjwg_maps_lng_c;

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

            public String getSalutation() {
                return salutation;
            }

            public void setSalutation(String salutation) {
                this.salutation = salutation;
            }

            public String getFirst_name() {
                return first_name;
            }

            public void setFirst_name(String first_name) {
                this.first_name = first_name;
            }

            public String getLast_name() {
                return last_name;
            }

            public void setLast_name(String last_name) {
                this.last_name = last_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public String getDo_not_call() {
                return do_not_call;
            }

            public void setDo_not_call(String do_not_call) {
                this.do_not_call = do_not_call;
            }

            public String getPhone_home() {
                return phone_home;
            }

            public void setPhone_home(String phone_home) {
                this.phone_home = phone_home;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone_mobile() {
                return phone_mobile;
            }

            public void setPhone_mobile(String phone_mobile) {
                this.phone_mobile = phone_mobile;
            }

            public String getPhone_work() {
                return phone_work;
            }

            public void setPhone_work(String phone_work) {
                this.phone_work = phone_work;
            }

            public String getPhone_other() {
                return phone_other;
            }

            public void setPhone_other(String phone_other) {
                this.phone_other = phone_other;
            }

            public String getPhone_fax() {
                return phone_fax;
            }

            public void setPhone_fax(String phone_fax) {
                this.phone_fax = phone_fax;
            }

            public String getEmail1() {
                return email1;
            }

            public void setEmail1(String email1) {
                this.email1 = email1;
            }

            public String getEmail2() {
                return email2;
            }

            public void setEmail2(String email2) {
                this.email2 = email2;
            }

            public String getInvalid_email() {
                return invalid_email;
            }

            public void setInvalid_email(String invalid_email) {
                this.invalid_email = invalid_email;
            }

            public String getEmail_opt_out() {
                return email_opt_out;
            }

            public void setEmail_opt_out(String email_opt_out) {
                this.email_opt_out = email_opt_out;
            }

            public String getLawful_basis() {
                return lawful_basis;
            }

            public void setLawful_basis(String lawful_basis) {
                this.lawful_basis = lawful_basis;
            }

            public String getDate_reviewed() {
                return date_reviewed;
            }

            public void setDate_reviewed(String date_reviewed) {
                this.date_reviewed = date_reviewed;
            }

            public String getLawful_basis_source() {
                return lawful_basis_source;
            }

            public void setLawful_basis_source(String lawful_basis_source) {
                this.lawful_basis_source = lawful_basis_source;
            }

            public String getPrimary_address_street() {
                return primary_address_street;
            }

            public void setPrimary_address_street(String primary_address_street) {
                this.primary_address_street = primary_address_street;
            }

            public String getPrimary_address_street_2() {
                return primary_address_street_2;
            }

            public void setPrimary_address_street_2(String primary_address_street_2) {
                this.primary_address_street_2 = primary_address_street_2;
            }

            public String getPrimary_address_street_3() {
                return primary_address_street_3;
            }

            public void setPrimary_address_street_3(String primary_address_street_3) {
                this.primary_address_street_3 = primary_address_street_3;
            }

            public String getPrimary_address_city() {
                return primary_address_city;
            }

            public void setPrimary_address_city(String primary_address_city) {
                this.primary_address_city = primary_address_city;
            }

            public String getPrimary_address_state() {
                return primary_address_state;
            }

            public void setPrimary_address_state(String primary_address_state) {
                this.primary_address_state = primary_address_state;
            }

            public String getPrimary_address_postalcode() {
                return primary_address_postalcode;
            }

            public void setPrimary_address_postalcode(String primary_address_postalcode) {
                this.primary_address_postalcode = primary_address_postalcode;
            }

            public String getPrimary_address_country() {
                return primary_address_country;
            }

            public void setPrimary_address_country(String primary_address_country) {
                this.primary_address_country = primary_address_country;
            }

            public String getAlt_address_street() {
                return alt_address_street;
            }

            public void setAlt_address_street(String alt_address_street) {
                this.alt_address_street = alt_address_street;
            }

            public String getAlt_address_street_2() {
                return alt_address_street_2;
            }

            public void setAlt_address_street_2(String alt_address_street_2) {
                this.alt_address_street_2 = alt_address_street_2;
            }

            public String getAlt_address_street_3() {
                return alt_address_street_3;
            }

            public void setAlt_address_street_3(String alt_address_street_3) {
                this.alt_address_street_3 = alt_address_street_3;
            }

            public String getAlt_address_city() {
                return alt_address_city;
            }

            public void setAlt_address_city(String alt_address_city) {
                this.alt_address_city = alt_address_city;
            }

            public String getAlt_address_state() {
                return alt_address_state;
            }

            public void setAlt_address_state(String alt_address_state) {
                this.alt_address_state = alt_address_state;
            }

            public String getAlt_address_postalcode() {
                return alt_address_postalcode;
            }

            public void setAlt_address_postalcode(String alt_address_postalcode) {
                this.alt_address_postalcode = alt_address_postalcode;
            }

            public String getAlt_address_country() {
                return alt_address_country;
            }

            public void setAlt_address_country(String alt_address_country) {
                this.alt_address_country = alt_address_country;
            }

            public String getAssistant() {
                return assistant;
            }

            public void setAssistant(String assistant) {
                this.assistant = assistant;
            }

            public String getAssistant_phone() {
                return assistant_phone;
            }

            public void setAssistant_phone(String assistant_phone) {
                this.assistant_phone = assistant_phone;
            }

            public String getEmail_addresses_primary() {
                return email_addresses_primary;
            }

            public void setEmail_addresses_primary(String email_addresses_primary) {
                this.email_addresses_primary = email_addresses_primary;
            }

            public String getEmail_addresses() {
                return email_addresses;
            }

            public void setEmail_addresses(String email_addresses) {
                this.email_addresses = email_addresses;
            }

            public String getEmail_addresses_non_primary() {
                return email_addresses_non_primary;
            }

            public void setEmail_addresses_non_primary(String email_addresses_non_primary) {
                this.email_addresses_non_primary = email_addresses_non_primary;
            }

            public String getEmail_and_name1() {
                return email_and_name1;
            }

            public void setEmail_and_name1(String email_and_name1) {
                this.email_and_name1 = email_and_name1;
            }

            public String getLead_source() {
                return lead_source;
            }

            public void setLead_source(String lead_source) {
                this.lead_source = lead_source;
            }

            public String getAccount_name() {
                return account_name;
            }

            public void setAccount_name(String account_name) {
                this.account_name = account_name;
            }

            public String getAccount_id() {
                return account_id;
            }

            public void setAccount_id(String account_id) {
                this.account_id = account_id;
            }

            public String getOpportunity_role_fields() {
                return opportunity_role_fields;
            }

            public void setOpportunity_role_fields(String opportunity_role_fields) {
                this.opportunity_role_fields = opportunity_role_fields;
            }

            public String getOpportunity_role_id() {
                return opportunity_role_id;
            }

            public void setOpportunity_role_id(String opportunity_role_id) {
                this.opportunity_role_id = opportunity_role_id;
            }

            public String getOpportunity_role() {
                return opportunity_role;
            }

            public void setOpportunity_role(String opportunity_role) {
                this.opportunity_role = opportunity_role;
            }

            public String getReports_to_id() {
                return reports_to_id;
            }

            public void setReports_to_id(String reports_to_id) {
                this.reports_to_id = reports_to_id;
            }

            public String getReport_to_name() {
                return report_to_name;
            }

            public void setReport_to_name(String report_to_name) {
                this.report_to_name = report_to_name;
            }

            public String getBirthdate() {
                return birthdate;
            }

            public void setBirthdate(String birthdate) {
                this.birthdate = birthdate;
            }

            public String getAccounts() {
                return accounts;
            }

            public void setAccounts(String accounts) {
                this.accounts = accounts;
            }

            public ReportsToLinkBean getReports_to_link() {
                return reports_to_link;
            }

            public void setReports_to_link(ReportsToLinkBean reports_to_link) {
                this.reports_to_link = reports_to_link;
            }

            public String getOpportunities() {
                return opportunities;
            }

            public void setOpportunities(String opportunities) {
                this.opportunities = opportunities;
            }

            public String getBugs() {
                return bugs;
            }

            public void setBugs(String bugs) {
                this.bugs = bugs;
            }

            public String getCalls() {
                return calls;
            }

            public void setCalls(String calls) {
                this.calls = calls;
            }

            public String getCases() {
                return cases;
            }

            public void setCases(String cases) {
                this.cases = cases;
            }

            public String getDirect_reports() {
                return direct_reports;
            }

            public void setDirect_reports(String direct_reports) {
                this.direct_reports = direct_reports;
            }

            public String getEmails() {
                return emails;
            }

            public void setEmails(String emails) {
                this.emails = emails;
            }

            public String getDocuments() {
                return documents;
            }

            public void setDocuments(String documents) {
                this.documents = documents;
            }

            public String getLeads() {
                return leads;
            }

            public void setLeads(String leads) {
                this.leads = leads;
            }

            public String getMeetings() {
                return meetings;
            }

            public void setMeetings(String meetings) {
                this.meetings = meetings;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getProject() {
                return project;
            }

            public void setProject(String project) {
                this.project = project;
            }

            public String getProject_resource() {
                return project_resource;
            }

            public void setProject_resource(String project_resource) {
                this.project_resource = project_resource;
            }

            public String getAm_projecttemplates_resources() {
                return am_projecttemplates_resources;
            }

            public void setAm_projecttemplates_resources(String am_projecttemplates_resources) {
                this.am_projecttemplates_resources = am_projecttemplates_resources;
            }

            public String getAm_projecttemplates_contacts_1() {
                return am_projecttemplates_contacts_1;
            }

            public void setAm_projecttemplates_contacts_1(String am_projecttemplates_contacts_1) {
                this.am_projecttemplates_contacts_1 = am_projecttemplates_contacts_1;
            }

            public String getTasks() {
                return tasks;
            }

            public void setTasks(String tasks) {
                this.tasks = tasks;
            }

            public String getTasks_parent() {
                return tasks_parent;
            }

            public void setTasks_parent(String tasks_parent) {
                this.tasks_parent = tasks_parent;
            }

            public String getNotes_parent() {
                return notes_parent;
            }

            public void setNotes_parent(String notes_parent) {
                this.notes_parent = notes_parent;
            }

            public UserSyncBean getUser_sync() {
                return user_sync;
            }

            public void setUser_sync(UserSyncBean user_sync) {
                this.user_sync = user_sync;
            }

            public String getCampaign_id() {
                return campaign_id;
            }

            public void setCampaign_id(String campaign_id) {
                this.campaign_id = campaign_id;
            }

            public String getCampaign_name() {
                return campaign_name;
            }

            public void setCampaign_name(String campaign_name) {
                this.campaign_name = campaign_name;
            }

            public String getCampaigns() {
                return campaigns;
            }

            public void setCampaigns(String campaigns) {
                this.campaigns = campaigns;
            }

            public CampaignContactsBean getCampaign_contacts() {
                return campaign_contacts;
            }

            public void setCampaign_contacts(CampaignContactsBean campaign_contacts) {
                this.campaign_contacts = campaign_contacts;
            }

            public String getC_accept_status_fields() {
                return c_accept_status_fields;
            }

            public void setC_accept_status_fields(String c_accept_status_fields) {
                this.c_accept_status_fields = c_accept_status_fields;
            }

            public String getM_accept_status_fields() {
                return m_accept_status_fields;
            }

            public void setM_accept_status_fields(String m_accept_status_fields) {
                this.m_accept_status_fields = m_accept_status_fields;
            }

            public String getAccept_status_id() {
                return accept_status_id;
            }

            public void setAccept_status_id(String accept_status_id) {
                this.accept_status_id = accept_status_id;
            }

            public String getAccept_status_name() {
                return accept_status_name;
            }

            public void setAccept_status_name(String accept_status_name) {
                this.accept_status_name = accept_status_name;
            }

            public String getProspect_lists() {
                return prospect_lists;
            }

            public void setProspect_lists(String prospect_lists) {
                this.prospect_lists = prospect_lists;
            }

            public String getSync_contact() {
                return sync_contact;
            }

            public void setSync_contact(String sync_contact) {
                this.sync_contact = sync_contact;
            }

            public String getFp_events_contacts() {
                return fp_events_contacts;
            }

            public void setFp_events_contacts(String fp_events_contacts) {
                this.fp_events_contacts = fp_events_contacts;
            }

            public String getAos_quotes() {
                return aos_quotes;
            }

            public void setAos_quotes(String aos_quotes) {
                this.aos_quotes = aos_quotes;
            }

            public String getAos_invoices() {
                return aos_invoices;
            }

            public void setAos_invoices(String aos_invoices) {
                this.aos_invoices = aos_invoices;
            }

            public String getAos_contracts() {
                return aos_contracts;
            }

            public void setAos_contracts(String aos_contracts) {
                this.aos_contracts = aos_contracts;
            }

            public String getE_invite_status_fields() {
                return e_invite_status_fields;
            }

            public void setE_invite_status_fields(String e_invite_status_fields) {
                this.e_invite_status_fields = e_invite_status_fields;
            }

            public String getEvent_status_name() {
                return event_status_name;
            }

            public void setEvent_status_name(String event_status_name) {
                this.event_status_name = event_status_name;
            }

            public String getEvent_invite_id() {
                return event_invite_id;
            }

            public void setEvent_invite_id(String event_invite_id) {
                this.event_invite_id = event_invite_id;
            }

            public String getE_accept_status_fields() {
                return e_accept_status_fields;
            }

            public void setE_accept_status_fields(String e_accept_status_fields) {
                this.e_accept_status_fields = e_accept_status_fields;
            }

            public String getEvent_accept_status() {
                return event_accept_status;
            }

            public void setEvent_accept_status(String event_accept_status) {
                this.event_accept_status = event_accept_status;
            }

            public String getEvent_status_id() {
                return event_status_id;
            }

            public void setEvent_status_id(String event_status_id) {
                this.event_status_id = event_status_id;
            }

            public String getProject_contacts_1() {
                return project_contacts_1;
            }

            public void setProject_contacts_1(String project_contacts_1) {
                this.project_contacts_1 = project_contacts_1;
            }

            public String getAop_case_updates() {
                return aop_case_updates;
            }

            public void setAop_case_updates(String aop_case_updates) {
                this.aop_case_updates = aop_case_updates;
            }

            public String getJoomla_account_id() {
                return joomla_account_id;
            }

            public void setJoomla_account_id(String joomla_account_id) {
                this.joomla_account_id = joomla_account_id;
            }

            public boolean isPortal_account_disabled() {
                return portal_account_disabled;
            }

            public void setPortal_account_disabled(boolean portal_account_disabled) {
                this.portal_account_disabled = portal_account_disabled;
            }

            public String getJoomla_account_access() {
                return joomla_account_access;
            }

            public void setJoomla_account_access(String joomla_account_access) {
                this.joomla_account_access = joomla_account_access;
            }

            public String getPortal_user_type() {
                return portal_user_type;
            }

            public void setPortal_user_type(String portal_user_type) {
                this.portal_user_type = portal_user_type;
            }

            public String getJjwg_maps_address_c() {
                return jjwg_maps_address_c;
            }

            public void setJjwg_maps_address_c(String jjwg_maps_address_c) {
                this.jjwg_maps_address_c = jjwg_maps_address_c;
            }

            public String getJjwg_maps_geocode_status_c() {
                return jjwg_maps_geocode_status_c;
            }

            public void setJjwg_maps_geocode_status_c(String jjwg_maps_geocode_status_c) {
                this.jjwg_maps_geocode_status_c = jjwg_maps_geocode_status_c;
            }

            public String getJjwg_maps_lat_c() {
                return jjwg_maps_lat_c;
            }

            public void setJjwg_maps_lat_c(String jjwg_maps_lat_c) {
                this.jjwg_maps_lat_c = jjwg_maps_lat_c;
            }

            public String getJjwg_maps_lng_c() {
                return jjwg_maps_lng_c;
            }

            public void setJjwg_maps_lng_c(String jjwg_maps_lng_c) {
                this.jjwg_maps_lng_c = jjwg_maps_lng_c;
            }

            public static class ReportsToLinkBean {
            }

            public static class UserSyncBean {
            }

            public static class CampaignContactsBean {
            }
        }

        public static class RelationshipsBean {
            /**
             * AM_ProjectTemplates : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/am_projecttemplates_contacts_1"}}
             * AOS_Contracts : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_contracts"}}
             * AOS_Invoices : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_invoices"}}
             * AOS_Quotes : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_quotes"}}
             * CampaignLog : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/campaigns"}}
             * EmailAddress : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/email_addresses"}}
             * Opportunities : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/opportunities"}}
             * Project : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/project_contacts_1"}}
             * ProspectLists : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/prospect_lists"}}
             * SecurityGroups : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/SecurityGroups"}}
             * Users : {"links":{"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/created_by_link"}}
             */

            private AMProjectTemplatesBean AM_ProjectTemplates;
            private AOSContractsBean AOS_Contracts;
            private AOSInvoicesBean AOS_Invoices;
            private AOSQuotesBean AOS_Quotes;
            private CampaignLogBean CampaignLog;
            private EmailAddressBean EmailAddress;
            private OpportunitiesBean Opportunities;
            private ProjectBean Project;
            private ProspectListsBean ProspectLists;
            private SecurityGroupsBean SecurityGroups;
            private UsersBean Users;

            public AMProjectTemplatesBean getAM_ProjectTemplates() {
                return AM_ProjectTemplates;
            }

            public void setAM_ProjectTemplates(AMProjectTemplatesBean AM_ProjectTemplates) {
                this.AM_ProjectTemplates = AM_ProjectTemplates;
            }

            public AOSContractsBean getAOS_Contracts() {
                return AOS_Contracts;
            }

            public void setAOS_Contracts(AOSContractsBean AOS_Contracts) {
                this.AOS_Contracts = AOS_Contracts;
            }

            public AOSInvoicesBean getAOS_Invoices() {
                return AOS_Invoices;
            }

            public void setAOS_Invoices(AOSInvoicesBean AOS_Invoices) {
                this.AOS_Invoices = AOS_Invoices;
            }

            public AOSQuotesBean getAOS_Quotes() {
                return AOS_Quotes;
            }

            public void setAOS_Quotes(AOSQuotesBean AOS_Quotes) {
                this.AOS_Quotes = AOS_Quotes;
            }

            public CampaignLogBean getCampaignLog() {
                return CampaignLog;
            }

            public void setCampaignLog(CampaignLogBean CampaignLog) {
                this.CampaignLog = CampaignLog;
            }

            public EmailAddressBean getEmailAddress() {
                return EmailAddress;
            }

            public void setEmailAddress(EmailAddressBean EmailAddress) {
                this.EmailAddress = EmailAddress;
            }

            public OpportunitiesBean getOpportunities() {
                return Opportunities;
            }

            public void setOpportunities(OpportunitiesBean Opportunities) {
                this.Opportunities = Opportunities;
            }

            public ProjectBean getProject() {
                return Project;
            }

            public void setProject(ProjectBean Project) {
                this.Project = Project;
            }

            public ProspectListsBean getProspectLists() {
                return ProspectLists;
            }

            public void setProspectLists(ProspectListsBean ProspectLists) {
                this.ProspectLists = ProspectLists;
            }

            public SecurityGroupsBean getSecurityGroups() {
                return SecurityGroups;
            }

            public void setSecurityGroups(SecurityGroupsBean SecurityGroups) {
                this.SecurityGroups = SecurityGroups;
            }

            public UsersBean getUsers() {
                return Users;
            }

            public void setUsers(UsersBean Users) {
                this.Users = Users;
            }

            public static class AMProjectTemplatesBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/am_projecttemplates_contacts_1"}
                 */

                private LinksBean links;

                public LinksBean getLinks() {
                    return links;
                }

                public void setLinks(LinksBean links) {
                    this.links = links;
                }

                public static class LinksBean {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/am_projecttemplates_contacts_1
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class AOSContractsBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_contracts"}
                 */

                private LinksBeanX links;

                public LinksBeanX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanX links) {
                    this.links = links;
                }

                public static class LinksBeanX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_contracts
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class AOSInvoicesBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_invoices"}
                 */

                private LinksBeanXX links;

                public LinksBeanXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXX links) {
                    this.links = links;
                }

                public static class LinksBeanXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_invoices
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class AOSQuotesBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_quotes"}
                 */

                private LinksBeanXXX links;

                public LinksBeanXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/aos_quotes
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class CampaignLogBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/campaigns"}
                 */

                private LinksBeanXXXX links;

                public LinksBeanXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/campaigns
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class EmailAddressBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/email_addresses"}
                 */

                private LinksBeanXXXXX links;

                public LinksBeanXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/email_addresses
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class OpportunitiesBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/opportunities"}
                 */

                private LinksBeanXXXXXX links;

                public LinksBeanXXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/opportunities
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class ProjectBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/project_contacts_1"}
                 */

                private LinksBeanXXXXXXX links;

                public LinksBeanXXXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/project_contacts_1
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class ProspectListsBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/prospect_lists"}
                 */

                private LinksBeanXXXXXXXX links;

                public LinksBeanXXXXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/prospect_lists
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class SecurityGroupsBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/SecurityGroups"}
                 */

                private LinksBeanXXXXXXXXX links;

                public LinksBeanXXXXXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/SecurityGroups
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }

            public static class UsersBean {
                /**
                 * links : {"related":"V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/created_by_link"}
                 */

                private LinksBeanXXXXXXXXXX links;

                public LinksBeanXXXXXXXXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXXXXXXXXX links) {
                    this.links = links;
                }

                public static class LinksBeanXXXXXXXXXX {
                    /**
                     * related : V8/module/8f3b4cc3-569e-e76c-f163-6033ddb6587b/relationships/created_by_link
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }
        }
    }
}

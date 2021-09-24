package com.dev.goldengames.model;

public class ModelUser {

    /**
     * data : {"type":"User","id":"1","attributes":{"id":"1","user_name":"admin","system_generated_password":"0","pwd_last_changed":"","authenticate_id":"","sugar_login":"1","first_name":"","last_name":"Administrator","full_name":"Administrator","name":"Administrator","is_admin":"1","external_auth_only":"0","receive_notifications":"1","description":"","date_entered":"02/19/2021 01:40","date_modified":"02/20/2021 11:33","modified_user_id":"1","modified_by_name":"Administrator","created_by":"","created_by_name":"","title":"Administrator","photo":"","department":"","phone_home":"","phone_mobile":"","phone_work":"","phone_other":"","phone_fax":"","status":"Active","address_street":"","address_city":"","address_state":"","address_country":"","address_postalcode":"","UserType":"","deleted":"0","portal_only":"0","show_on_employees":"1","employee_status":"Active","messenger_id":"","messenger_type":"","calls":"","meetings":"","contacts_sync":"","reports_to_id":"","reports_to_name":"","reports_to_link":{},"reportees":"","email1":"","email_addresses":"","email_addresses_primary":"","email_link_type":"","editor_type":"","aclroles":"","is_group":"0","c_accept_status_fields":"","m_accept_status_fields":"","accept_status_id":"","accept_status_name":"","prospect_lists":"","emails_users":"","eapm":"","oauth_tokens":"","project_resource":"","project_users_1":"","am_projecttemplates_resources":"","am_projecttemplates_users_1":"","SecurityGroups":"","securitygroup_noninher_fields":"","securitygroup_noninherit_id":"","securitygroup_noninheritable":"","securitygroup_primary_group":"","factor_auth":"0","factor_auth_interface":""},"relationships":{"AM_ProjectTemplates":{"links":{"related":"V8/current-user/relationships/am_projecttemplates_users_1"}},"EmailAddress":{"links":{"related":"V8/current-user/relationships/email_addresses"}},"Emails":{"links":{"related":"V8/current-user/relationships/emails_users"}},"OAuthTokens":{"links":{"related":"V8/current-user/relationships/oauth_tokens"}},"Project":{"links":{"related":"V8/current-user/relationships/project_users_1"}},"ProspectLists":{"links":{"related":"V8/current-user/relationships/prospect_lists"}},"SecurityGroups":{"links":{"related":"V8/current-user/relationships/SecurityGroups"}}}}
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
         * type : User
         * id : 1
         * attributes : {"id":"1","user_name":"admin","system_generated_password":"0","pwd_last_changed":"","authenticate_id":"","sugar_login":"1","first_name":"","last_name":"Administrator","full_name":"Administrator","name":"Administrator","is_admin":"1","external_auth_only":"0","receive_notifications":"1","description":"","date_entered":"02/19/2021 01:40","date_modified":"02/20/2021 11:33","modified_user_id":"1","modified_by_name":"Administrator","created_by":"","created_by_name":"","title":"Administrator","photo":"","department":"","phone_home":"","phone_mobile":"","phone_work":"","phone_other":"","phone_fax":"","status":"Active","address_street":"","address_city":"","address_state":"","address_country":"","address_postalcode":"","UserType":"","deleted":"0","portal_only":"0","show_on_employees":"1","employee_status":"Active","messenger_id":"","messenger_type":"","calls":"","meetings":"","contacts_sync":"","reports_to_id":"","reports_to_name":"","reports_to_link":{},"reportees":"","email1":"","email_addresses":"","email_addresses_primary":"","email_link_type":"","editor_type":"","aclroles":"","is_group":"0","c_accept_status_fields":"","m_accept_status_fields":"","accept_status_id":"","accept_status_name":"","prospect_lists":"","emails_users":"","eapm":"","oauth_tokens":"","project_resource":"","project_users_1":"","am_projecttemplates_resources":"","am_projecttemplates_users_1":"","SecurityGroups":"","securitygroup_noninher_fields":"","securitygroup_noninherit_id":"","securitygroup_noninheritable":"","securitygroup_primary_group":"","factor_auth":"0","factor_auth_interface":""}
         * relationships : {"AM_ProjectTemplates":{"links":{"related":"V8/current-user/relationships/am_projecttemplates_users_1"}},"EmailAddress":{"links":{"related":"V8/current-user/relationships/email_addresses"}},"Emails":{"links":{"related":"V8/current-user/relationships/emails_users"}},"OAuthTokens":{"links":{"related":"V8/current-user/relationships/oauth_tokens"}},"Project":{"links":{"related":"V8/current-user/relationships/project_users_1"}},"ProspectLists":{"links":{"related":"V8/current-user/relationships/prospect_lists"}},"SecurityGroups":{"links":{"related":"V8/current-user/relationships/SecurityGroups"}}}
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
             * id : 1
             * user_name : admin
             * system_generated_password : 0
             * pwd_last_changed :
             * authenticate_id :
             * sugar_login : 1
             * first_name :
             * last_name : Administrator
             * full_name : Administrator
             * name : Administrator
             * is_admin : 1
             * external_auth_only : 0
             * receive_notifications : 1
             * description :
             * date_entered : 02/19/2021 01:40
             * date_modified : 02/20/2021 11:33
             * modified_user_id : 1
             * modified_by_name : Administrator
             * created_by :
             * created_by_name :
             * title : Administrator
             * photo :
             * department :
             * phone_home :
             * phone_mobile :
             * phone_work :
             * phone_other :
             * phone_fax :
             * status : Active
             * address_street :
             * address_city :
             * address_state :
             * address_country :
             * address_postalcode :
             * UserType :
             * deleted : 0
             * portal_only : 0
             * show_on_employees : 1
             * employee_status : Active
             * messenger_id :
             * messenger_type :
             * calls :
             * meetings :
             * contacts_sync :
             * reports_to_id :
             * reports_to_name :
             * reports_to_link : {}
             * reportees :
             * email1 :
             * email_addresses :
             * email_addresses_primary :
             * email_link_type :
             * editor_type :
             * aclroles :
             * is_group : 0
             * c_accept_status_fields :
             * m_accept_status_fields :
             * accept_status_id :
             * accept_status_name :
             * prospect_lists :
             * emails_users :
             * eapm :
             * oauth_tokens :
             * project_resource :
             * project_users_1 :
             * am_projecttemplates_resources :
             * am_projecttemplates_users_1 :
             * SecurityGroups :
             * securitygroup_noninher_fields :
             * securitygroup_noninherit_id :
             * securitygroup_noninheritable :
             * securitygroup_primary_group :
             * factor_auth : 0
             * factor_auth_interface :
             */

            private String id;
            private String user_name;
            private String system_generated_password;
            private String pwd_last_changed;
            private String authenticate_id;
            private String sugar_login;
            private String first_name;
            private String last_name;
            private String full_name;
            private String name;
            private String is_admin;
            private String external_auth_only;
            private String receive_notifications;
            private String description;
            private String date_entered;
            private String date_modified;
            private String modified_user_id;
            private String modified_by_name;
            private String created_by;
            private String created_by_name;
            private String title;
            private String photo;
            private String department;
            private String phone_home;
            private String phone_mobile;
            private String phone_work;
            private String phone_other;
            private String phone_fax;
            private String status;
            private String address_street;
            private String address_city;
            private String address_state;
            private String address_country;
            private String address_postalcode;
            private String UserType;
            private String deleted;
            private String portal_only;
            private String show_on_employees;
            private String employee_status;
            private String messenger_id;
            private String messenger_type;
            private String calls;
            private String meetings;
            private String contacts_sync;
            private String reports_to_id;
            private String reports_to_name;
            private ReportsToLinkBean reports_to_link;
            private String reportees;
            private String email1;
            private String email_addresses;
            private String email_addresses_primary;
            private String email_link_type;
            private String editor_type;
            private String aclroles;
            private String is_group;
            private String c_accept_status_fields;
            private String m_accept_status_fields;
            private String accept_status_id;
            private String accept_status_name;
            private String prospect_lists;
            private String emails_users;
            private String eapm;
            private String oauth_tokens;
            private String project_resource;
            private String project_users_1;
            private String am_projecttemplates_resources;
            private String am_projecttemplates_users_1;
            private String SecurityGroups;
            private String securitygroup_noninher_fields;
            private String securitygroup_noninherit_id;
            private String securitygroup_noninheritable;
            private String securitygroup_primary_group;
            private String factor_auth;
            private String factor_auth_interface;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getSystem_generated_password() {
                return system_generated_password;
            }

            public void setSystem_generated_password(String system_generated_password) {
                this.system_generated_password = system_generated_password;
            }

            public String getPwd_last_changed() {
                return pwd_last_changed;
            }

            public void setPwd_last_changed(String pwd_last_changed) {
                this.pwd_last_changed = pwd_last_changed;
            }

            public String getAuthenticate_id() {
                return authenticate_id;
            }

            public void setAuthenticate_id(String authenticate_id) {
                this.authenticate_id = authenticate_id;
            }

            public String getSugar_login() {
                return sugar_login;
            }

            public void setSugar_login(String sugar_login) {
                this.sugar_login = sugar_login;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIs_admin() {
                return is_admin;
            }

            public void setIs_admin(String is_admin) {
                this.is_admin = is_admin;
            }

            public String getExternal_auth_only() {
                return external_auth_only;
            }

            public void setExternal_auth_only(String external_auth_only) {
                this.external_auth_only = external_auth_only;
            }

            public String getReceive_notifications() {
                return receive_notifications;
            }

            public void setReceive_notifications(String receive_notifications) {
                this.receive_notifications = receive_notifications;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
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

            public String getPhone_home() {
                return phone_home;
            }

            public void setPhone_home(String phone_home) {
                this.phone_home = phone_home;
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

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getAddress_street() {
                return address_street;
            }

            public void setAddress_street(String address_street) {
                this.address_street = address_street;
            }

            public String getAddress_city() {
                return address_city;
            }

            public void setAddress_city(String address_city) {
                this.address_city = address_city;
            }

            public String getAddress_state() {
                return address_state;
            }

            public void setAddress_state(String address_state) {
                this.address_state = address_state;
            }

            public String getAddress_country() {
                return address_country;
            }

            public void setAddress_country(String address_country) {
                this.address_country = address_country;
            }

            public String getAddress_postalcode() {
                return address_postalcode;
            }

            public void setAddress_postalcode(String address_postalcode) {
                this.address_postalcode = address_postalcode;
            }

            public String getUserType() {
                return UserType;
            }

            public void setUserType(String UserType) {
                this.UserType = UserType;
            }

            public String getDeleted() {
                return deleted;
            }

            public void setDeleted(String deleted) {
                this.deleted = deleted;
            }

            public String getPortal_only() {
                return portal_only;
            }

            public void setPortal_only(String portal_only) {
                this.portal_only = portal_only;
            }

            public String getShow_on_employees() {
                return show_on_employees;
            }

            public void setShow_on_employees(String show_on_employees) {
                this.show_on_employees = show_on_employees;
            }

            public String getEmployee_status() {
                return employee_status;
            }

            public void setEmployee_status(String employee_status) {
                this.employee_status = employee_status;
            }

            public String getMessenger_id() {
                return messenger_id;
            }

            public void setMessenger_id(String messenger_id) {
                this.messenger_id = messenger_id;
            }

            public String getMessenger_type() {
                return messenger_type;
            }

            public void setMessenger_type(String messenger_type) {
                this.messenger_type = messenger_type;
            }

            public String getCalls() {
                return calls;
            }

            public void setCalls(String calls) {
                this.calls = calls;
            }

            public String getMeetings() {
                return meetings;
            }

            public void setMeetings(String meetings) {
                this.meetings = meetings;
            }

            public String getContacts_sync() {
                return contacts_sync;
            }

            public void setContacts_sync(String contacts_sync) {
                this.contacts_sync = contacts_sync;
            }

            public String getReports_to_id() {
                return reports_to_id;
            }

            public void setReports_to_id(String reports_to_id) {
                this.reports_to_id = reports_to_id;
            }

            public String getReports_to_name() {
                return reports_to_name;
            }

            public void setReports_to_name(String reports_to_name) {
                this.reports_to_name = reports_to_name;
            }

            public ReportsToLinkBean getReports_to_link() {
                return reports_to_link;
            }

            public void setReports_to_link(ReportsToLinkBean reports_to_link) {
                this.reports_to_link = reports_to_link;
            }

            public String getReportees() {
                return reportees;
            }

            public void setReportees(String reportees) {
                this.reportees = reportees;
            }

            public String getEmail1() {
                return email1;
            }

            public void setEmail1(String email1) {
                this.email1 = email1;
            }

            public String getEmail_addresses() {
                return email_addresses;
            }

            public void setEmail_addresses(String email_addresses) {
                this.email_addresses = email_addresses;
            }

            public String getEmail_addresses_primary() {
                return email_addresses_primary;
            }

            public void setEmail_addresses_primary(String email_addresses_primary) {
                this.email_addresses_primary = email_addresses_primary;
            }

            public String getEmail_link_type() {
                return email_link_type;
            }

            public void setEmail_link_type(String email_link_type) {
                this.email_link_type = email_link_type;
            }

            public String getEditor_type() {
                return editor_type;
            }

            public void setEditor_type(String editor_type) {
                this.editor_type = editor_type;
            }

            public String getAclroles() {
                return aclroles;
            }

            public void setAclroles(String aclroles) {
                this.aclroles = aclroles;
            }

            public String getIs_group() {
                return is_group;
            }

            public void setIs_group(String is_group) {
                this.is_group = is_group;
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

            public String getEmails_users() {
                return emails_users;
            }

            public void setEmails_users(String emails_users) {
                this.emails_users = emails_users;
            }

            public String getEapm() {
                return eapm;
            }

            public void setEapm(String eapm) {
                this.eapm = eapm;
            }

            public String getOauth_tokens() {
                return oauth_tokens;
            }

            public void setOauth_tokens(String oauth_tokens) {
                this.oauth_tokens = oauth_tokens;
            }

            public String getProject_resource() {
                return project_resource;
            }

            public void setProject_resource(String project_resource) {
                this.project_resource = project_resource;
            }

            public String getProject_users_1() {
                return project_users_1;
            }

            public void setProject_users_1(String project_users_1) {
                this.project_users_1 = project_users_1;
            }

            public String getAm_projecttemplates_resources() {
                return am_projecttemplates_resources;
            }

            public void setAm_projecttemplates_resources(String am_projecttemplates_resources) {
                this.am_projecttemplates_resources = am_projecttemplates_resources;
            }

            public String getAm_projecttemplates_users_1() {
                return am_projecttemplates_users_1;
            }

            public void setAm_projecttemplates_users_1(String am_projecttemplates_users_1) {
                this.am_projecttemplates_users_1 = am_projecttemplates_users_1;
            }

            public String getSecurityGroups() {
                return SecurityGroups;
            }

            public void setSecurityGroups(String SecurityGroups) {
                this.SecurityGroups = SecurityGroups;
            }

            public String getSecuritygroup_noninher_fields() {
                return securitygroup_noninher_fields;
            }

            public void setSecuritygroup_noninher_fields(String securitygroup_noninher_fields) {
                this.securitygroup_noninher_fields = securitygroup_noninher_fields;
            }

            public String getSecuritygroup_noninherit_id() {
                return securitygroup_noninherit_id;
            }

            public void setSecuritygroup_noninherit_id(String securitygroup_noninherit_id) {
                this.securitygroup_noninherit_id = securitygroup_noninherit_id;
            }

            public String getSecuritygroup_noninheritable() {
                return securitygroup_noninheritable;
            }

            public void setSecuritygroup_noninheritable(String securitygroup_noninheritable) {
                this.securitygroup_noninheritable = securitygroup_noninheritable;
            }

            public String getSecuritygroup_primary_group() {
                return securitygroup_primary_group;
            }

            public void setSecuritygroup_primary_group(String securitygroup_primary_group) {
                this.securitygroup_primary_group = securitygroup_primary_group;
            }

            public String getFactor_auth() {
                return factor_auth;
            }

            public void setFactor_auth(String factor_auth) {
                this.factor_auth = factor_auth;
            }

            public String getFactor_auth_interface() {
                return factor_auth_interface;
            }

            public void setFactor_auth_interface(String factor_auth_interface) {
                this.factor_auth_interface = factor_auth_interface;
            }

            public static class ReportsToLinkBean {
            }
        }

        public static class RelationshipsBean {
            /**
             * AM_ProjectTemplates : {"links":{"related":"V8/current-user/relationships/am_projecttemplates_users_1"}}
             * EmailAddress : {"links":{"related":"V8/current-user/relationships/email_addresses"}}
             * Emails : {"links":{"related":"V8/current-user/relationships/emails_users"}}
             * OAuthTokens : {"links":{"related":"V8/current-user/relationships/oauth_tokens"}}
             * Project : {"links":{"related":"V8/current-user/relationships/project_users_1"}}
             * ProspectLists : {"links":{"related":"V8/current-user/relationships/prospect_lists"}}
             * SecurityGroups : {"links":{"related":"V8/current-user/relationships/SecurityGroups"}}
             */

            private AMProjectTemplatesBean AM_ProjectTemplates;
            private EmailAddressBean EmailAddress;
            private EmailsBean Emails;
            private OAuthTokensBean OAuthTokens;
            private ProjectBean Project;
            private ProspectListsBean ProspectLists;
            private SecurityGroupsBean SecurityGroups;

            public AMProjectTemplatesBean getAM_ProjectTemplates() {
                return AM_ProjectTemplates;
            }

            public void setAM_ProjectTemplates(AMProjectTemplatesBean AM_ProjectTemplates) {
                this.AM_ProjectTemplates = AM_ProjectTemplates;
            }

            public EmailAddressBean getEmailAddress() {
                return EmailAddress;
            }

            public void setEmailAddress(EmailAddressBean EmailAddress) {
                this.EmailAddress = EmailAddress;
            }

            public EmailsBean getEmails() {
                return Emails;
            }

            public void setEmails(EmailsBean Emails) {
                this.Emails = Emails;
            }

            public OAuthTokensBean getOAuthTokens() {
                return OAuthTokens;
            }

            public void setOAuthTokens(OAuthTokensBean OAuthTokens) {
                this.OAuthTokens = OAuthTokens;
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

            public static class AMProjectTemplatesBean {
                /**
                 * links : {"related":"V8/current-user/relationships/am_projecttemplates_users_1"}
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
                     * related : V8/current-user/relationships/am_projecttemplates_users_1
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
                 * links : {"related":"V8/current-user/relationships/email_addresses"}
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
                     * related : V8/current-user/relationships/email_addresses
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

            public static class EmailsBean {
                /**
                 * links : {"related":"V8/current-user/relationships/emails_users"}
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
                     * related : V8/current-user/relationships/emails_users
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

            public static class OAuthTokensBean {
                /**
                 * links : {"related":"V8/current-user/relationships/oauth_tokens"}
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
                     * related : V8/current-user/relationships/oauth_tokens
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
                 * links : {"related":"V8/current-user/relationships/project_users_1"}
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
                     * related : V8/current-user/relationships/project_users_1
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
                 * links : {"related":"V8/current-user/relationships/prospect_lists"}
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
                     * related : V8/current-user/relationships/prospect_lists
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
                 * links : {"related":"V8/current-user/relationships/SecurityGroups"}
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
                     * related : V8/current-user/relationships/SecurityGroups
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

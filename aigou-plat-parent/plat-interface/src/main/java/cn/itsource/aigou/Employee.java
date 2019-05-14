package cn.itsource.aigou;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDate;
    @TableName("t_employee")
    public class Employee implements Serializable {

        private static final long serialVersionUID=1L;

        @TableId(value = "id", type = IdType.AUTO)
        private Long id;

        @TableField("userName")
        private String userName;

        @TableField("realName")
        private String realName;

        private String password;

        private String phone;

        private String email;

        private Long departmentId;

        @TableField("inputTime")
        private LocalDate inputTime;

        private Integer state;

        private Long unionId;

        private Long tenantId;

        private Long roles;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Long getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
        }

        public LocalDate getInputTime() {
            return inputTime;
        }

        public void setInputTime(LocalDate inputTime) {
            this.inputTime = inputTime;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public Long getUnionId() {
            return unionId;
        }

        public void setUnionId(Long unionId) {
            this.unionId = unionId;
        }

        public Long getTenantId() {
            return tenantId;
        }

        public void setTenantId(Long tenantId) {
            this.tenantId = tenantId;
        }

        public Long getRoles() {
            return roles;
        }

        public void setRoles(Long roles) {
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", userName=" + userName +
                    ", realName=" + realName +
                    ", password=" + password +
                    ", phone=" + phone +
                    ", email=" + email +
                    ", departmentId=" + departmentId +
                    ", inputTime=" + inputTime +
                    ", state=" + state +
                    ", unionId=" + unionId +
                    ", tenantId=" + tenantId +
                    ", roles=" + roles +
                    "}";
        }
}

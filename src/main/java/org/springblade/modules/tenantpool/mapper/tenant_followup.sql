INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685389412732934', 0, 'ownerpool', 'tenant_followup', 'menu', '/ownerpool/tenant_followup', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685389412732935', '1399685389412732934', 'tenant_followup_add', '新增', 'add', '/ownerpool/tenant_followup/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685389412732936', '1399685389412732934', 'tenant_followup_edit', '修改', 'edit', '/ownerpool/tenant_followup/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685389412732937', '1399685389412732934', 'tenant_followup_delete', '删除', 'delete', '/api/ownerpool/tenant_followup/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685389412732938', '1399685389412732934', 'tenant_followup_view', '查看', 'view', '/ownerpool/tenant_followup/view', 'file-text', 4, 2, 2, 1, NULL, 0);

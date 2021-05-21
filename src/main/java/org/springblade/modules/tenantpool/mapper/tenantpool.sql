INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1395750987393667078', 0, 'tenantpool', 'tenantpool', 'menu', '/tenantpool/tenantpool', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1395750987393667079', '1395750987393667078', 'tenantpool_add', '新增', 'add', '/tenantpool/tenantpool/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1395750987393667080', '1395750987393667078', 'tenantpool_edit', '修改', 'edit', '/tenantpool/tenantpool/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1395750987393667081', '1395750987393667078', 'tenantpool_delete', '删除', 'delete', '/api/tenantpool/tenantpool/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1395750987393667082', '1395750987393667078', 'tenantpool_view', '查看', 'view', '/tenantpool/tenantpool/view', 'file-text', 4, 2, 2, 1, NULL, 0);

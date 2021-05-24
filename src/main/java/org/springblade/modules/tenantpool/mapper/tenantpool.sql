INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1396728918597177351', 0, 'tenantpool', 'tenantpool', 'menu', '/tenantpool/tenantpool', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1396728918597177352', '1396728918597177351', 'tenantpool_add', '新增', 'add', '/tenantpool/tenantpool/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1396728918597177353', '1396728918597177351', 'tenantpool_edit', '修改', 'edit', '/tenantpool/tenantpool/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1396728918597177354', '1396728918597177351', 'tenantpool_delete', '删除', 'delete', '/api/tenantpool/tenantpool/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1396728918597177355', '1396728918597177351', 'tenantpool_view', '查看', 'view', '/tenantpool/tenantpool/view', 'file-text', 4, 2, 2, 1, NULL, 0);

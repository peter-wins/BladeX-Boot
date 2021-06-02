INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400031505002008583', 0, 'listings', 'listings_management', 'menu', '/listings/listings_management', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400031505002008584', '1400031505002008583', 'listings_management_add', '新增', 'add', '/listings/listings_management/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400031505002008585', '1400031505002008583', 'listings_management_edit', '修改', 'edit', '/listings/listings_management/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400031505002008586', '1400031505002008583', 'listings_management_delete', '删除', 'delete', '/api/listings/listings_management/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400031505002008587', '1400031505002008583', 'listings_management_view', '查看', 'view', '/listings/listings_management/view', 'file-text', 4, 2, 2, 1, NULL, 0);

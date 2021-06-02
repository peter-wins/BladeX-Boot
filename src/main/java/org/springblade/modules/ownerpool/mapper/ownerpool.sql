INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079117604360198', 0, 'ownerpool', 'ownerpool', 'menu', '/ownerpool/ownerpool', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079117604360199', '1400079117604360198', 'ownerpool_add', '新增', 'add', '/ownerpool/ownerpool/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079117604360200', '1400079117604360198', 'ownerpool_edit', '修改', 'edit', '/ownerpool/ownerpool/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079117604360201', '1400079117604360198', 'ownerpool_delete', '删除', 'delete', '/api/ownerpool/ownerpool/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079117604360202', '1400079117604360198', 'ownerpool_view', '查看', 'view', '/ownerpool/ownerpool/view', 'file-text', 4, 2, 2, 1, NULL, 0);

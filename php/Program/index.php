<?php
// import file Anggota
require('Anggota.php');

// list data awal
$list = [];
$list[0] = new Anggota("1234", "ARYA", "KETUM", "PSI", "waduh.jpg");
$list[1] = new Anggota("5678", "TATA", "WAKETUM", "PSI", "waduh.jpg");
$list[2] = new Anggota("4321", "RAKA", "ANGGOTA", "PDIP", "waduh.jpg");
$list[3] = new Anggota("5467", "JASON", "ANGGOTA", "PPP", "waduh.jpg");
?>

<table border="1px" style="border-collapse: collapse; width: 50%;">
    <tr>
        <th>ID</th>
        <th>NAMA</th>
        <th>BIDANG</th>
        <th>PARTAI</th>
        <th>FOTO</th>
    </tr>
    <?php
        foreach($list as $item){
    ?>
        <tr>
            <td><?= $item->getId() ?></td>
            <td><?= $item->getNama() ?></td>
            <td><?= $item->getBidang() ?></td>
            <td><?= $item->getPartai() ?></td>
            <td><img width="50px" src="<?= $item->getFoto() ?>" alt="waduh"></td>
        </tr>
    <?php
        }
    ?>
</table>

<br>

<?php
// penambahan data
echo "NEW DATA HAS BEEN ADDED";
$list[4] = new Anggota("1290", "RAFIE", "KETUM", "KUDAHITAM", "waduh.jpg");
?>

<br>
<br>

<table border="1px" style="border-collapse: collapse; width: 50%;">
    <tr>
        <th>ID</th>
        <th>NAMA</th>
        <th>BIDANG</th>
        <th>PARTAI</th>
        <th>FOTO</th>
    </tr>
    <?php
        foreach($list as $item){
    ?>
        <tr>
            <td><?= $item->getId() ?></td>
            <td><?= $item->getNama() ?></td>
            <td><?= $item->getBidang() ?></td>
            <td><?= $item->getPartai() ?></td>
            <td><img width="50px" src="<?= $item->getFoto() ?>" alt="waduh"></td>
        </tr>
    <?php
        }
    ?>
</table>

<br>

<?php
// update data
$list[4]->setBidang("ANGGOTA");
echo $list[4]->getNama()." HAS BEEN UPDATED";
?>

<br>
<br>

<table border="1px" style="border-collapse: collapse; width: 50%;">
    <tr>
        <th>ID</th>
        <th>NAMA</th>
        <th>BIDANG</th>
        <th>PARTAI</th>
        <th>FOTO</th>
    </tr>
    <?php
        foreach($list as $item){
    ?>
        <tr>
            <td><?= $item->getId() ?></td>
            <td><?= $item->getNama() ?></td>
            <td><?= $item->getBidang() ?></td>
            <td><?= $item->getPartai() ?></td>
            <td><img width="50px" src="<?= $item->getFoto() ?>" alt="waduh"></td>
        </tr>
    <?php
        }
    ?>
</table>

<br>

<?php
// delete data
echo $list[2]->getNama()." HAS BEEN DELETED";
array_splice($list, 2, 1);
?>

<br>
<br>

<table border="1px" style="border-collapse: collapse; width: 50%;">
    <tr>
        <th>ID</th>
        <th>NAMA</th>
        <th>BIDANG</th>
        <th>PARTAI</th>
        <th>FOTO</th>
    </tr>
    <?php
        foreach($list as $item){
    ?>
        <tr>
            <td><?= $item->getId() ?></td>
            <td><?= $item->getNama() ?></td>
            <td><?= $item->getBidang() ?></td>
            <td><?= $item->getPartai() ?></td>
            <td><img width="50px" src="<?= $item->getFoto() ?>" alt="waduh"></td>
        </tr>
    <?php
        }
    ?>
</table>